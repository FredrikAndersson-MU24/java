package items;
public abstract class Weapon extends Item implements Offense {

    private int damage;


    public Weapon(String itemName, int damage) {
        super(itemName);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
