public class Nekromant extends Character{
    public Nekromant(String name, int health, int power, String race){
        super(name, health, power, race);
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

}
