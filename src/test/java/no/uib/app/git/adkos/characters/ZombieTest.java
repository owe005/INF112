package no.uib.app.git.adkos.characters;


import no.uib.app.git.adkos.characters.enemies.Zombie;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.GameWorld;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ZombieTest {

    GameWorld game;
    Entity ent;

    @BeforeEach
    void setUp(){
        ent = new Entity();
        game = new GameWorld();
        ent.addComponent(new Zombie(100,5,200));
        game.addEntity(ent);

    }

    @Test
    void zombieTakeDamage(){
        int current = ent.getComponent(Zombie.class).getHealth();
        ent.getComponent(Zombie.class).takeDamage(10);
        Assertions.assertEquals(90 , current -10);
    }

    @Test
    void Gethealth(){
        Assertions.assertEquals(ent.getComponent(Zombie.class).getHealth(), 100);
    }

}
