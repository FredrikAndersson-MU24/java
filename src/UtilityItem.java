public class UtilityItem extends Item{

    private int healthBoost;

    public UtilityItem(String itemName, int healthBoost) {
        super(itemName);
        this.healthBoost = healthBoost;
    }
}
