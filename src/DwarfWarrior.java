public class DwarfWarrior extends Hero{

    int rage;

    @Override
    public void mainWeaponHit() {
        this.rage +=25;
    }

    @Override
    public void offWeaponHit() {
        this.rage +=10;
    }

    @Override
    public void receiveHit() {
        super.health -=15;
    }

    @Override
    public void areaOfEffectDamage() {
        super.health -=10;
    }
}
