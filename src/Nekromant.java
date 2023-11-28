public class Nekromant extends Character implements IHealable{
    public Nekromant(String name, int health, int power, String race, int level, int xp, int shield){
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

    public int attack(String Monster){
        return 25;
    }

    public void defend(int attackPower){
        int defendDamage = 15;
        int remainingHealth = getHealth() - (attackPower - defendDamage);

        if(remainingHealth < 0) {
            setHealth(0);
        } else {
            setHealth(remainingHealth);
        }


    }

    @Override
    public void heal(Character character, int healing) throws WrongNameException {
        int healedHealth;

        if(character.getRace().equals("Nekromant")){
            healedHealth = getHealth() + healing;
            setHealth(healedHealth);
        }else{
            throw new WrongNameException();
        }
    }
}
