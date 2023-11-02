public class SkeletonKing extends Monster{
    public SkeletonKing(String name, int health, int power, String race){
        super(name, health, power, race);
    }

    public int attack(String target){
        return getPower();
    }
    public int defend(int attackPower) {
        int defendDamage = 15;
        int remainingHealth = getHealth() - (attackPower - defendDamage);

        if(remainingHealth <= 0) {
            setHealth(0);
        } else {
            setHealth(remainingHealth);
        }

        return remainingHealth;


    }

}
