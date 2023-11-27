public class Effects {
    private int damage;
    private int heal;
    private int shield;

    public Effects(int damage, int heal, int shield) {
        this.damage = damage;
        this.heal = heal;
        this.shield = shield;
    }


    public void typeOfEffect(String item, Character character){
        if(item.equals("Dragonfire Elixir")){
            //Character character;
            heal = 15;
            //character.setHealth(character.getHealth() + heal);
        }
        else if(item.equals("Eldritch Blade")){
            damage += 6;
        } else if (item.equals("Wyvern Armor")) {
            shield += 10;
        }
    }


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }
}
