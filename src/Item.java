public class Item {

    private String name;

    private int damageModifier;

    private int armorValue;

    private int healthModifier;


    public Item(String name, int damageModifier, int armorValue, int healthModifier) {
        this.name = name;
        this.damageModifier = damageModifier;
        this.armorValue = armorValue;
        this.healthModifier = healthModifier;
    }


    public String getName() {
        return name;
    }

    public int getDamageModifier() {
        return damageModifier;
    }

    public int getArmorValue() {
        return armorValue;
    }

    public int getHealthModifier() {
        return healthModifier;
    }


}
