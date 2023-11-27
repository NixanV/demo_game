import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<String> items = new ArrayList<>();

    public void addItem(String item){
        items.add(item);
    }

    public void removeItem(String i){
        boolean removed = false;
        for(String item : items){
            if(item.equals(i)){
                items.remove(i);
                removed = true;
                break;
            }
        }
        if(removed){
            System.out.println(i + " item is removed from inventory");
        }else {
            System.out.println(i + "is not found in inventory");
        }
    }

    public void effect(Effects effects){
        for(String item : items){
            effects.typeOfEffect(item);
        }
    }

}
