package items;
import enemies.Character;

public abstract class Item {
    private String itemName;


    public Item(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return "items.Item{" +
                "itemName='" + itemName + '\'' +
                '}';
    }

    public String getItemName() {
        return itemName;
    }
    public abstract Item getCopy();


    public abstract void useItem(Character target);


}
