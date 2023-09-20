package no.uib.app.git.adkos.colisionhandler;

import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.physics.CollisionHandler;
import no.uib.app.git.adkos.EntityType;
import static com.almasb.fxgl.dsl.FXGLForKtKt.inc;

/**
 * class that handles Coin collision
 * Adds coin to player and removes from world.
 */

public class CoinHandler extends CollisionHandler {

    public CoinHandler(){
        super(EntityType.PLAYER, EntityType.COIN);
    }

    @Override
    public void onCollisionBegin(Entity player, Entity coin){
        inc("gold", +1);
        coin.removeFromWorld();
    }

}
