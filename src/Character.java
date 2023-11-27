import javax.management.openmbean.TabularDataSupport;

public abstract class Character implements IDefendable, IHealable{
    private String name;
    private int health;
    private int power;
    private String race;
    private int level;
    private int xp;
    private int shield;

    public Character(String name, int health, int power, String race, int level, int xp, int shield){
        this.name = name;
        this.health = health;
        this.power = power;
        this.race = race;
        this.level = level;
        this.xp = xp;
        this.shield = shield;
    }

    public abstract void gainExperience(int xp);

    public abstract void levelUp();
    public abstract int attack(String monster);
//    public abstract int defend(int attackPower);

    public int getLevel(){return level; }

    public void setLevel(int level){
        this.level = level;
    }

    public int getXp(){return xp;}

    public void setXp(int xp){
        this.xp = xp;
    }
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

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }
}
