package no.uib.app.git.adkos.menus;

import com.almasb.fxgl.animation.Animation;
import com.almasb.fxgl.animation.Interpolators;
import com.almasb.fxgl.app.scene.FXGLMenu;
import com.almasb.fxgl.app.scene.MenuType;
import com.almasb.fxgl.core.util.EmptyRunnable;
import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.ui.FontType;
import javafx.beans.binding.Bindings;
import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class MainMenu extends FXGLMenu {

    private static final int SIZE = 150;

    private Animation<?> animation;

    public MainMenu() {
        super(MenuType.MAIN_MENU);

        getContentRoot().setTranslateX(FXGL.getAppWidth() / 2.0 - SIZE);
        getContentRoot().setTranslateY(FXGL.getAppHeight() / 2.0 - SIZE);

        var shape = new Rectangle(SIZE * 2, SIZE / 2);
        shape.setStrokeWidth(2.5);
        shape.strokeProperty().bind(
                Bindings.when(shape.hoverProperty()).then(Color.GRAY).otherwise(Color.BLACK)
        );

        shape.fillProperty().bind(
                Bindings.when(shape.pressedProperty()).then(Color.GRAY).otherwise(Color.DARKGRAY)
        );

        shape.setTranslateY(SIZE);
        shape.setOnMouseClicked(e -> fireNewGame());

        var shape2 = new Rectangle(SIZE * 2, SIZE / 2);
        shape2.setStrokeWidth(2.5);
        shape2.strokeProperty().bind(
                Bindings.when(shape2.hoverProperty()).then(Color.GRAY).otherwise(Color.BLACK)
        );

        shape2.fillProperty().bind(
                Bindings.when(shape2.pressedProperty()).then(Color.GRAY).otherwise(Color.DARKGRAY)
        );

        shape2.setOnMouseClicked(e -> fireExit());
        shape2.setTranslateY(SIZE * 1.65);

        Text textStart = FXGL.getUIFactoryService().newText("START GAME", Color.WHITE, FontType.GAME, 24.0);
        textStart.setTranslateX(100);
        textStart.setTranslateY(195);
        textStart.setMouseTransparent(true);

        Text textExit = FXGL.getUIFactoryService().newText("EXIT", Color.WHITE, FontType.GAME, 24.0);
        textExit.setTranslateX(135);
        textExit.setTranslateY(295);
        textExit.setMouseTransparent(true);

        getContentRoot().getChildren().addAll(shape, shape2, textStart, textExit);

        getContentRoot().setScaleX(0);
        getContentRoot().setScaleY(0);

        animation = FXGL.animationBuilder()
                .duration(Duration.seconds(0.66))
                .interpolator(Interpolators.EXPONENTIAL.EASE_OUT())
                .scale(getContentRoot())
                .from(new Point2D(0, 0))
                .to(new Point2D(1, 1))
                .build();
    }

    @Override
    public void onCreate() {
        animation.setOnFinished(EmptyRunnable.INSTANCE);
        animation.stop();
        animation.start();
    }

    @Override
    protected void onUpdate(double tpf) {
        animation.onUpdate(tpf);
    }
}