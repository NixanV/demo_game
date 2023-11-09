public abstract class Monster implements IAttackable{
    private String name;
    private int health;
    private int power;
    private String race;

    public Monster(String name, int health, int power, String race){
        this.name = name;
        this.health = health;
        this.power = power;
        this.race = race;
    }

//    @Override
//    public void takeDamage(int damage) {
//        int remainingHealth;
//        remainingHealth = getHealth() - damage;
//        setHealth(remainingHealth);
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public abstract int attack(String target);
}
