public class FallenShaman extends Monster{
    public FallenShaman(String name, int health, int power, String race){
        super(name, health, power, race);
    }

    @Override
    public int attack(String target) {
        return getPower();
    }

}
