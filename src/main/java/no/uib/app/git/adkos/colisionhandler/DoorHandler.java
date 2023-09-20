package no.uib.app.git.adkos.colisionhandler;
import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.physics.CollisionHandler;
import no.uib.app.git.adkos.EntityType;
import no.uib.app.git.adkos.GameApp;

/**
 * Class that handles door collision (level finish sone)
 * it fades to black and starts up GameApp.newLevel() that
 * loads a new level.
 */

public class DoorHandler extends CollisionHandler {

    GameApp game;
    public DoorHandler(GameApp game) {
        super(EntityType.PLAYER, EntityType.LEVEL_FINISH);
        this.game = game;
    }

    @Override
    protected void onCollision(Entity player, Entity door) {
        FXGL.getGameScene().getViewport().fade(game::newLevel);
    }
}
