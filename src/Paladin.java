public class Paladin extends Character implements IHealable{

    public Paladin(String name, int health, int power, String race, int level, int xp) {
        super(name, health, power, race, level, xp);
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
        return getPower();
    }

    @Override
    public void defend(int attackPower) {
        int defendDamage = 25;
        int remainingHealth = (getHealth() - (attackPower - defendDamage));

        setHealth(Math.max(remainingHealth, 0));

    }


    @Override
    public void heal(Character character, int healing) throws WrongNameException {
        int healedHealth;

        if(character.getRace().equals("Paladin")){
            healedHealth = getHealth() + healing;
            setHealth(healedHealth);
        }else{
            throw new WrongNameException();
        }
    }
}
