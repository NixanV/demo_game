public class Paladin extends Character {

    public Paladin(String name, int health, int power, String race) {
        super(name, health, power, race);
    }

    @Override
    public int attack(String monster) {
        return getPower();
    }

    @Override
    public int defend(int attackPower) {
        int defendDamage = 25;
        int remainingHealth = (getHealth() - (attackPower - defendDamage));

        if(remainingHealth <= 0) {
            setHealth(0);
        } else {
            setHealth(remainingHealth);
        }

        return remainingHealth;


    }
}