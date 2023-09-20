package no.uib.app.git.adkos;

import javafx.scene.text.Text;
import no.uib.app.git.adkos.characters.Player;
import no.uib.app.git.adkos.characters.enemies.Zombie;
import no.uib.app.git.adkos.colisionhandler.CoinHandler;
import no.uib.app.git.adkos.colisionhandler.DoorHandler;
import no.uib.app.git.adkos.menus.GameMenu;
import no.uib.app.git.adkos.menus.MainMenu;
import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.app.scene.FXGLMenu;
import com.almasb.fxgl.app.scene.SceneFactory;
import com.almasb.fxgl.app.scene.Viewport;
import com.almasb.fxgl.core.serialization.Bundle;
import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.input.UserAction;
import com.almasb.fxgl.physics.PhysicsComponent;
import com.almasb.fxgl.profile.DataFile;
import com.almasb.fxgl.profile.SaveLoadHandler;
import no.uib.app.git.adkos.factories.PlatformerFactory;
import javafx.animation.FadeTransition;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.almasb.fxgl.dsl.FXGL.*;
import static com.almasb.fxgl.dsl.FXGLForKtKt.inc;
import static no.uib.app.git.adkos.EntityType.*;

public class GameApp extends GameApplication {

    private static final int MAX_LEVEL = 2;
    private static final int STARTING_LEVEL = 0;

    private Entity player;

    private ArrayList<Entity> zombies = new ArrayList<>();

    @Override
    protected void initSettings(GameSettings settings) {
        settings.setWidth(1280);
        settings.setHeight(720);
        settings.setTitle("A Platformer");
        settings.setVersion("0.0.1");
        settings.setManualResizeEnabled(true);
        settings.setPreserveResizeRatio(true);
        settings.setMainMenuEnabled(true);
        settings.setDeveloperMenuEnabled(true);
        settings.setEntityPreloadEnabled(true);

        settings.setSceneFactory(new SceneFactory() {
            @Override
            public FXGLMenu newMainMenu() {
                return new MainMenu();
            }
            @Override
            public FXGLMenu newGameMenu() {
                return new GameMenu();
            }
        });
    }

    @Override
    protected void initPhysics() {
        getPhysicsWorld().setGravity(0, 3000);
        getPhysicsWorld().addCollisionHandler(new CoinHandler());
        getPhysicsWorld().addCollisionHandler(new DoorHandler(this));
    }

    // Player movement controls
    @Override
    protected void initInput() {
        getInput().addAction(new UserAction("Left Movement") {
            @Override
            protected void onAction() {
                player.getComponent(Player.class).left();
            }

            @Override
            protected void onActionEnd() {
                player.getComponent(Player.class).stop();
            }
        }, KeyCode.A);


        getInput().addAction(new UserAction("Attack") {
            @Override
            protected void onActionBegin() {
                player.getComponent(Player.class).attack();
            }
        }, MouseButton.PRIMARY);

        getInput().addAction(new UserAction("Right Movement") {
            @Override
            protected void onAction() {
                player.getComponent(Player.class).right();
            }

            @Override
            protected void onActionEnd() {
                player.getComponent(Player.class).stop();
            }
        }, KeyCode.D);

        getInput().addAction(new UserAction("Jump") {
            @Override
            protected void onActionBegin() {
                player.getComponent(Player.class).jump();
            }
        }, KeyCode.W);
    }

    public  void newLevel() {
        if (geti("level") == MAX_LEVEL) {
            return;
        }
        inc("level", +1);
        setLevel(geti("level"));
    }


    // Start of game saving code
    @Override
    protected void onPreInit() {
        getSaveLoadService().addHandler(new SaveLoadHandler() {
            @Override
            public void onSave(DataFile data) {
                // create a new bundle to store your data
                var bundle = new Bundle("gameData");

                // store some data
                double health = getd("health");
                bundle.put("health", health);

                int level = geti("level");
                bundle.put("level", level);

                // give the bundle to data file
                data.putBundle(bundle);
            }

            @Override
            public void onLoad(DataFile data) {
                // get your previously saved bundle
                var bundle = data.getBundle("gameData");

                // retrieve some data
                double health = bundle.get("health");

                // update your game with saved data
                set("health", health);
            }
        });
    }


    private void setLevel(int levelNum) {
        if (player != null) {
            player.getComponent(PhysicsComponent.class).overwritePosition(new Point2D(70, 50));
            player.setZIndex(Integer.MAX_VALUE);
        }
        setLevelFromMap("tmx/level" + levelNum  + ".tmx");
    }

    @Override
    protected void initGameVars(Map<String, Object> vars) {
        vars.put("level", STARTING_LEVEL);
        vars.put("zombies", zombies);
        vars.put("health", 100.0);
        vars.put("gold", 0);
    }

    @Override
    protected void initUI() {
        Node node = player.getComponent(Player.class).getHealthBar();
        addUINode(node,10,10);

        Text goldAmount = FXGL.addText("", 10, 40);
        goldAmount.textProperty().bind(FXGL.getip("gold").asString("Gold: %d"));
    }

    @Override
    protected void onUpdate(double tpf) {
        if (!player.getComponent(Player.class).isDead()) {
            if (player.getY() > getAppHeight()) {
                player.getComponent(Player.class).takeDamage(2);
            }

            //load base, died, have to progress from start of level?
            if (player.getComponent(Player.class).getCurrentHp() <= 0)
                onPlayerDied();
        }

        List<Entity> collidingEntities = FXGL.getGameWorld().getCollidingEntities(player);
        for(Entity entity : collidingEntities) {
            if(entity.isType(EntityType.ZOMBIE)) {
                Zombie zombo = entity.getComponent(Zombie.class);
                if(entity.getProperties().exists("attackCooldown")) {
                    Long attackCool = entity.getProperties().getValue("attackCooldown");
                    if(System.currentTimeMillis() >= attackCool) {
                        entity.setProperty("attackCooldown", System.currentTimeMillis() + zombo.attackCooldow);
                        player.getComponent(Player.class).takeDamage(1);
                    }
                } else {
                    entity.setProperty("attackCooldown", System.currentTimeMillis() + zombo.attackCooldow);
                    player.getComponent(Player.class).takeDamage(1);
                }
            }
        }
    }

    public void onPlayerDied() {
        player.getComponent(Player.class).setDead(true);
        Rectangle rect = new Rectangle();
        rect.setHeight(getGameScene().getAppHeight());
        rect.setWidth(getGameScene().getAppWidth());
        rect.setFill(Paint.valueOf("black"));
        rect.setOpacity(0.0);
        getGameScene().addUINode(rect);

        FadeTransition fade = new FadeTransition(Duration.seconds(0.5), rect);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.play();
        rect.setVisible(true);



        getGameTimer().runOnceAfter(() -> {
            getGameScene().removeUINode(rect);
            setLevel(geti("level"));
            set("health", player.getComponent(Player.class).playerMaxHealth);
            player.getComponent(Player.class).resetHealth();
            player.getComponent(Player.class).getHealthBar().setCurrentValue(getd("health")); //TODO: get value from player maxvalue (DONE)
            player.getComponent(Player.class).setDead(false);
        }, Duration.seconds(2));

    }

    @Override
    protected void initGame() {
        getGameWorld().addEntityFactory(new PlatformerFactory());
        //player = null;
        newLevel();

        player = spawn("player", 70, 50);


        spawn("background");

        set("player", player);
        Viewport viewport = getGameScene().getViewport();
        viewport.setBounds(-15000, 0, 25 * 700, getAppHeight());
        viewport.bindToEntity(player, getAppWidth() / 2, getAppHeight() / 2);
        viewport.setLazy(true);

    }

    public static void main(String[] args) {
        launch(args);
    }
}
