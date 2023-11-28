public class Varvar extends Character{
    public Varvar(String name, int health, int power, String race, int level, int xp, int shield) {
        super(name, health, power, race, level, xp, shield);
    }

    @Override
    public void gainExperience(int xp) {
        setXp(getXp() + xp);
    }

    @Override
    public void levelUp() {
        while(getXp() > 100) {
            if (getXp() >= 100) {
                setLevel(getLevel() + 1);
                setXp(getXp() - 100);
                setHealth(getHealth() + 20);
                setPower(getPower() + 5);
            }
        }
        System.out.println("Your hero gain level");
    }

    @Override
    public int attack(String monster) {
        return 40;
    }

    @Override
    public void defend(int attackPower) {
        int defendDamage = 25;
        if(getShield() > 0 && getShield() >= attackPower){
            setShield(getShield() - attackPower);
        }
        else if(getShield() > 0 && getShield() < attackPower){
            setShield(0);
            attackPower -= getShield();
            if(attackPower > defendDamage){
                setHealth(getHealth() - (attackPower - defendDamage));
            }
        }

    }

    @Override
    public void heal(Character character, int healing) throws WrongNameException {

    }
}
