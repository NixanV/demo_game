public class Butcher extends Monster{
    public Butcher(String name, int health, int power, String race) {
        super(name, health, power, race);
    }


    @Override
    public void takeDamage(int damage) {
        int remainingHealth = getHealth() - damage;

        if(remainingHealth <= 0) {
            setHealth(0);
        } else {
            setHealth(remainingHealth);
        }


    }

}
