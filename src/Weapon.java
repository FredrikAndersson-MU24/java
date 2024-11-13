public abstract class Weapon extends Item{

    private int damage;


    public Weapon(String itemName, int damage) {
        super(itemName);
        this.damage = damage;
    }
}
