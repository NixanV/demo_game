public class SkeletonKing extends Monster{
    public SkeletonKing(String name, int health, int power, String race){
        super(name, health, power, race);
    }

    public int attack(String target){
        return getPower();
    }


    @Override
    public int takeDamage(int damage) {
        int remainingHealth = getHealth() - damage;

        if(remainingHealth <= 0) {
            setHealth(0);
        } else {
            setHealth(remainingHealth);
        }

        return remainingHealth;

    }
}
