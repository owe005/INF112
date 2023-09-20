package no.uib.app.git.adkos.animations;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.component.Component;
import com.almasb.fxgl.physics.PhysicsComponent;
import com.almasb.fxgl.texture.AnimatedTexture;
import com.almasb.fxgl.texture.AnimationChannel;
import com.almasb.fxgl.time.LocalTimer;
import javafx.geometry.Point2D;
import javafx.scene.image.Image;
import javafx.util.Duration;

import static com.almasb.fxgl.dsl.FXGL.image;

public class ZombieAnimations extends Component {

    private PhysicsComponent physics;

    private LocalTimer walkTimer;
    private LocalTimer walkTimer2;

    private AnimatedTexture texture;
    private AnimationChannel animIdle, animWalk;

    public ZombieAnimations(){
        animations();
    }

    private void animations(){
        Image image = image("player.png");
        animIdle = new AnimationChannel(image, 4, 32, 42, Duration.seconds(1), 1, 1);
        animWalk = new AnimationChannel(image, 4, 32, 42, Duration.seconds(0.66), 0, 3);
        texture = new AnimatedTexture(animIdle);
        texture.loop();
    }


    @Override
    public void onAdded() {
        walkTimer = FXGL.newLocalTimer();
        walkTimer.capture();

        walkTimer2 = FXGL.newLocalTimer();
        walkTimer2.capture();

        entity.getTransformComponent().setScaleOrigin(new Point2D(16, 21));
        entity.getViewComponent().addChild(texture);
    }

    @Override
    public void onUpdate(double tpf) {
        if (physics.isMovingX()) {
            if (texture.getAnimationChannel() != animWalk) {
                texture.loopAnimationChannel(animWalk);
            }
        } else {
            if (texture.getAnimationChannel() != animIdle) {
                texture.loopAnimationChannel(animIdle);
            }
        }

        if (walkTimer.elapsed(Duration.seconds(3))) {
            walkLeft();
            walkTimer.capture();
        } else if(walkTimer2.elapsed(Duration.seconds(6.05))) {
            walkRight();
            walkTimer2.capture();
        }
    }

    public void walkLeft() {
        getEntity().setScaleX(-1);
        physics.setVelocityX(-200);
    }

    public void walkRight() {
        getEntity().setScaleX(1);
        physics.setVelocityX(200);
    }


}
