public class Wicher extends Character implements IHealable{
    public Wicher(String name, int health, int power, String race) {
        super(name, health, power, race);
    }

    @Override
    public int attack(String monster) {
        return 0;
    }

    @Override
    public void defend(int attackPower) {
        int defendDamage = 10;
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

        if(character.getName().equals("Witcher")){
            healedHealth = getHealth() + healing;
            setHealth(healedHealth);
        }else{
            throw new WrongNameException();
        }
    }
}
