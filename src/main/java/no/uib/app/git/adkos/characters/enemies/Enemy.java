package no.uib.app.git.adkos.characters.enemies;

import com.almasb.fxgl.dsl.components.HealthIntComponent;
import com.almasb.fxgl.entity.component.Component;
import com.almasb.fxgl.physics.PhysicsComponent;
import com.almasb.fxgl.ui.ProgressBar;
import javafx.scene.paint.Color;


/**
 * generalization of enemies.
 * @author DanWin
 *
 * TODO: add jump for enemies?
 */

public abstract class Enemy extends Component implements IEnemyInterface {

    protected HealthIntComponent health;

    private int attackValue;
    private int moveSpeed;

    protected PhysicsComponent physics;
    private ProgressBar healthBar;

    protected Enemy(int hp, int damage, int moveSpeed){
        health = new HealthIntComponent(hp);
        this.attackValue = damage;
        this.moveSpeed = moveSpeed;
    }

    private void hpBar(){
        healthBar = new ProgressBar(false);
        healthBar.setMinValue(0);
        healthBar.setMaxValue(health.getValue());
        healthBar.setWidth(5);
        healthBar.setCurrentValue(health.getMaxValue());
        healthBar.setFill(Color.RED);
    }

    public ProgressBar getHealthBar(){
        return healthBar;
    }

    public Integer attack(){
        return attackValue;
    }

    public Integer getHealth(){
        return health.getValue();
    }

    public void takeDamage(int value) {
        health.damage(value);
    }

    public void walkLeft() {
        getEntity().setScaleX(1);
        physics.setVelocityX(-moveSpeed);
    }

    public void walkRight() {
        this.getEntity().setScaleX(1);
        physics.setVelocityX(moveSpeed);
    }
}
