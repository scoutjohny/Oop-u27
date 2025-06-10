public abstract class Hero {
    int health;
    int mana;

    public void showStats() {
        System.out.println("Here are our hero's details:");
    }

    abstract public void mainWeaponHit();
    abstract public void offWeaponHit();
    abstract public void receiveHit();
    abstract public void areaOfEffectDamage();
}
