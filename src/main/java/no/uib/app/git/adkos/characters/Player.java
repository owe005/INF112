package no.uib.app.git.adkos.characters;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.component.Component;
import com.almasb.fxgl.physics.PhysicsComponent;
import com.almasb.fxgl.texture.AnimatedTexture;
import com.almasb.fxgl.texture.AnimationChannel;
import com.almasb.fxgl.ui.ProgressBar;
import javafx.geometry.Point2D;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import no.uib.app.git.adkos.EntityType;


import java.util.List;

import static com.almasb.fxgl.dsl.FXGL.*;

public class Player extends Component {

    private PhysicsComponent physics;
    private AnimatedTexture texture;
    private AnimationChannel animIdle, animWalk;
    public boolean moving = false;
    public boolean hitWall = false;
    private int jumps = 2;
    private boolean facingRight = false;
    private boolean test = false;
    public double playerMaxHealth = 100;
    private boolean dead = false;


    private ProgressBar health;


    public Player() {
        animation();    //TODO: make Playeranimation its own component and remove from class.
        hpBar();       //TODO: make HP bar its own component and remove from class
    }

    /**
     * Setting idle and walking animation for player.
     */
    private void animation(){
        Image image = image("player.png");
        animIdle = new AnimationChannel(image, 4, 32, 42, Duration.seconds(1), 1, 1);
        animWalk = new AnimationChannel(image, 4, 32, 42, Duration.seconds(0.66), 0, 3);
        texture = new AnimatedTexture(animIdle);
        texture.loop();
    }

    /**
     * Player HP bar, think it should be done in game.
     */
    private void hpBar(){
        health = new ProgressBar(false);
        health.setMinValue(0);
        health.setMaxValue(playerMaxHealth);
        health.setWidth(300);
        health.setCurrentValue(playerMaxHealth);
        health.setFill(Color.RED);
    }

    @Override
    public void onAdded() {
        entity.getTransformComponent().setScaleOrigin(new Point2D(16, 21));
        entity.getViewComponent().addChild(texture);

        physics.onGroundProperty().addListener((obs, old, isOnGround) -> {
            if (isOnGround) {
                jumps = 2;
            }
        });
    }
    /**
     * on newframe updates the animations
     * @param tpf
     */
    @Override
    public void onUpdate(double tpf) {
        if (physics.isMovingX() && !hitWall) {
            if (texture.getAnimationChannel() != animWalk) {
                texture.loopAnimationChannel(animWalk);
            }
        } else {
            if (texture.getAnimationChannel() != animIdle) {
                texture.loopAnimationChannel(animIdle);
            }
        }

        if(!moving) {
            if(!physics.isMovingY()) {
                double newVel = physics.getVelocityX() * 0.95;
                if ((physics.getVelocityX() > 0 && newVel <= 50) || (physics.getVelocityX() < 0 && newVel >= -50))
                    physics.setVelocityX(0);
                else
                    physics.setVelocityX(newVel);
            }
        }
    }

    public void attack() {
        Entity player = this.getEntity();
        Rectangle2D rect = new Rectangle2D(player.getX(), player.getY(), 100, 100);
        new Rectangle(40, 40, Color.RED);
        List<Entity> closeEntities = FXGL.getGameWorld().getEntitiesInRange(rect);

        for(Entity entity : closeEntities) {
            if(entity.isType(EntityType.ZOMBIE)) {
                entity.removeFromWorld();
            }
        }
    }

    public void left() {
        if(!test) {
            getEntity().setScaleX(-1);
            physics.setVelocityX(-200);
            moving = true;
            facingRight = false;
        }
    }

    public void right() {
        if(!test) {
            getEntity().setScaleX(1);
            physics.setVelocityX(200);
            moving = true;
            facingRight = true;
        }
    }
    public void stop() {
        physics.setVelocityX(0);
        moving = false;
    }

    public void jump() {
        if (jumps == 0)
            return;

        getPhysicsWorld().setGravity(0, 3000);

        if(hitWall) {
            test = true;
            if(facingRight) {
                physics.setVelocityX(-400);
            } else {
                physics.setVelocityX(400);
            }
            physics.setVelocityY(-900);

            new java.util.Timer().schedule(
                    new java.util.TimerTask() {
                        @Override
                        public void run() {
                            test = false;
                        }
                    },
                    350
            );
            jumps = 0;
        } else {
            physics.setVelocityY(-900);
            jumps--;
        }
    }

    public ProgressBar getHealthBar(){
        return health;
    }

    public double getCurrentHp(){
        return health.getCurrentValue();
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(Boolean state) {
        dead = state;
    }

    public void resetHealth(){
        health.setCurrentValue(playerMaxHealth);
    }

    public void takeDamage(double value){
        health.setCurrentValue(health.getCurrentValue() - value);
    }
}
