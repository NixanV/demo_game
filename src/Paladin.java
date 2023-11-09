public class Paladin extends Character{

    public Paladin(String name, int health, int power, String race) {
        super(name, health, power, race);
    }

    @Override
    public int attack(String monster) {
        return getPower();
    }

    @Override
    public void defend(int attackPower) {
        int defendDamage = 25;
        int remainingHealth = (getHealth() - (attackPower - defendDamage));

        setHealth(Math.max(remainingHealth, 0));

    }



}
