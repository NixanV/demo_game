public class Butcher extends Monster{
    public Butcher(String name, int health, int power, String race) {
        super(name, health, power, race);
    }

    @Override
    public int attack(String target) {
        return getPower();
    }

    @Override
    public int takeDamage(int damage) {

    }

}
