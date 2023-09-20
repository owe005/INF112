package no.uib.app.git.adkos.characters.enemies;

public interface IEnemyInterface {

    public Integer attack();
    public Integer getHealth();
    public void takeDamage(int value);
    public void walkLeft();
    public void walkRight();
    //public void jump(); //?
}
