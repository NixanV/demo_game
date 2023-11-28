public class Item {
//    5. Създаване на клас Предмети
//    Обновяване на Клас: Item
//    Полета (частни):
//
//    name (String): Името на предмета.
//            effect (Effect): Ефектът, който предметът има върху героя или чудовището.
//
//            Методи:
//
//    applyEffect(Character target): Прилага ефекта върху целта.

    private String name;

    public Item(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


    public void applyEffect(Character target, String item){
        if(item.equals("Dragonfire")){
            target.setHealth(target.getHealth() + 5);
        }
        else if(item.equals("Eldritch")){
            target.setPower(target.getPower() + 3);
        }
        else if(item.equals("Wyvern")){
            target.setShield(target.getShield() + 15);
        }
    }

}
