public class Varvar extends Character{
    public Varvar(String name, int health, int power, String race, int level, int xp) {
        super(name, health, power, race, level, xp);
    }

    @Override
    public void gainExperience(int xp) {

    }

    @Override
    public void levelUp() {

    }

    @Override
    public int attack(String monster) {
        return 40;
    }

    @Override
    public void defend(int attackPower) {
        int defendDamage = 25;
        int remainingHealth = getHealth() - (attackPower - defendDamage);

        if(remainingHealth < 0) {
            setHealth(0);
        } else {
            setHealth(remainingHealth);
        }

    }

    @Override
    public void heal(Character character, int healing) throws WrongNameException {

    }
}
