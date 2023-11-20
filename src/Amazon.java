public class Amazon extends Character implements IHealable{

    public Amazon(String name, int health, int power, String race) {
        super(name, health, power, race);
    }

    @Override
    public int attack(String monster) {
        return 40;
    }

    @Override
    public void defend(int takenDamage) {
        int defendDamage = 15;
        int remainingHealth;
        remainingHealth = getHealth() - (takenDamage - defendDamage);

        if(remainingHealth <= 0) {
            setHealth(0);
        } else {
            setHealth(remainingHealth);
        }
    }

    @Override
    public void heal(Character character, int healing) throws WrongNameException {
        int healedHealth;

        if(character.getRace().equals("Amazon")){
                healedHealth = getHealth() + healing;
                setHealth(healedHealth);
        }else{
            throw new WrongNameException();
        }


    }
}
