public class Amazon extends Character{

    public Amazon(String name, int health, int power, String race) {
        super(name, health, power, race);
    }

    @Override
    public int attack(String monster) {
        return 40;
    }

    @Override
    public int defend(int takenDamage) {
        int defendDamage = 15;
        int remainingHealth = getHealth() - (takenDamage - defendDamage);

        if(remainingHealth < 0) {
            setHealth(0);
        } else {
            setHealth(remainingHealth);
        }


        return remainingHealth;
    }

}
