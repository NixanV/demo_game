public class Nekromant extends Character implements IHealable{
    public Nekromant(String name, int health, int power, String race, int level, int xp){
        super(name, health, power, race, level, xp);
    }

    @Override
    public void gainExperience(int xp) {

    }

    @Override
    public void levelUp() {

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
