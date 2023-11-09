public class FallenShaman extends Monster{
    public FallenShaman(String name, int health, int power, String race){
        super(name, health, power, race);
    }

    @Override
    public int attack(String target) {
        return getPower();
    }

    @Override
    public void takeDamage(int damage) {
        int remainingHealth = getHealth() - damage;

        setHealth(Math.max(remainingHealth, 0));

    }
}
