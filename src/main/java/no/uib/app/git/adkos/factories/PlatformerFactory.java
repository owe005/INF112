package no.uib.app.git.adkos.factories;

import no.uib.app.git.adkos.animations.ZombieAnimations;
import no.uib.app.git.adkos.characters.enemies.Zombie;
import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.dsl.views.ScrollingBackgroundView;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.EntityFactory;
import com.almasb.fxgl.entity.SpawnData;
import com.almasb.fxgl.entity.Spawns;
import com.almasb.fxgl.entity.components.CollidableComponent;
import com.almasb.fxgl.entity.components.IrremovableComponent;
import com.almasb.fxgl.physics.BoundingShape;
import com.almasb.fxgl.physics.HitBox;
import com.almasb.fxgl.physics.PhysicsComponent;
import com.almasb.fxgl.physics.box2d.dynamics.BodyType;
import com.almasb.fxgl.physics.box2d.dynamics.FixtureDef;
import javafx.geometry.Point2D;
import no.uib.app.git.adkos.characters.Player;

import java.util.ArrayList;

import static com.almasb.fxgl.dsl.FXGL.*;
import static com.almasb.fxgl.dsl.FXGL.getAppHeight;
import static no.uib.app.git.adkos.EntityType.*;


/**
 * This class handles all spawning of entities for the game. Player enemies and map objects.
 */

public class PlatformerFactory implements EntityFactory {

    @Spawns("background")
    public Entity newBackground(SpawnData data) {
        return entityBuilder()
                .view(new ScrollingBackgroundView(texture("background/forest.png").getImage(), getAppWidth(), getAppHeight()))
                .zIndex(-1)
                .with(new IrremovableComponent())
                .build();
    }

    @Spawns("coin")
    public Entity newCoin(SpawnData data) {
        return entityBuilder(data)
                .type(COIN)
                .viewWithBBox(texture("coin.png"))
                .with(new CollidableComponent(true))
                .build();
    }

    @Spawns("levelFinish")
    public Entity newLevelFinish(SpawnData data) {
        return entityBuilder(data)
                .type(LEVEL_FINISH)
                .bbox(new HitBox(BoundingShape.box(data.<Integer>get("width"), data.<Integer>get("height"))))
                .with(new CollidableComponent(true))
                .build();
    }

    @Spawns("platform")
    public Entity newPlatform(SpawnData data) {
        return entityBuilder(data)
                .type(PLATFORM)
                .bbox(new HitBox(BoundingShape.box(data.<Integer>get("width"), data.<Integer>get("height"))))
                .with(new PhysicsComponent())
                .build();
    }

    @Spawns("zombie")
    public Entity newZombie(SpawnData data) {

        PhysicsComponent physics = new PhysicsComponent();
        physics.setBodyType(BodyType.DYNAMIC);
        physics.addGroundSensor(new HitBox("GROUND_SENSOR", new Point2D(16, 38), BoundingShape.box(6, 8)));

        // this avoids player sticking to walls
        physics.setFixtureDef(new FixtureDef().friction(0.0f));

        Entity zombo = entityBuilder(data)
                .type(ZOMBIE)
                .bbox(new HitBox(new Point2D(5,5), BoundingShape.circle(12)))
                .bbox(new HitBox(new Point2D(10,25), BoundingShape.box(10, 17)))
                .with(physics)
                .with(new ZombieAnimations())
                .with(new CollidableComponent(false))
                //.with(new IrremovableComponent())
                .with(new Zombie(100, 2, 200))
                .build();


        ArrayList<Entity> zombies = FXGL.geto("zombies");
        zombies.add(zombo);
        FXGL.set("zombies", zombies);

        return zombo;
    }

    @Spawns("player")
    public Entity newPlayer(SpawnData data) {
        PhysicsComponent physics = new PhysicsComponent();
        physics.setBodyType(BodyType.DYNAMIC);
        physics.addGroundSensor(new HitBox("GROUND_SENSOR", new Point2D(16, 38), BoundingShape.box(6, 8)));

        // this avoids player sticking to walls
        physics.setFixtureDef(new FixtureDef().friction(0.0f));

        return entityBuilder(data)
                .type(PLAYER)
                //.bbox(new HitBox(new Point2D(5,5), BoundingShape.circle(12)))
                .bbox(new HitBox(new Point2D(0,0), BoundingShape.box(30, 40)))
                .with(physics)
                .with(new CollidableComponent(true))
                .with(new IrremovableComponent())
                .with(new Player())
                .build();
    }
}
