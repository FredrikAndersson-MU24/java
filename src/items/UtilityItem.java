package items;
import enemies.Character;
public class UtilityItem extends Item implements Buff, Consumable{

    private int healthBoost;

    public UtilityItem(String itemName, int healthBoost) {
        super(itemName);
        this.healthBoost = healthBoost;
    }

    public int getHealthBoost() {
        return healthBoost;
    }

    @Override
    public Item getCopy(){
        return new UtilityItem(this.getItemName(), this.getHealthBoost());

    }

    @Override
    public void useItem(Character target) {
        System.out.println("using " + this.getItemName() + " on " + target.getName());
        target.increaseHealth(healthBoost);
    }

}
