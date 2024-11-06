import java.util.Random;

public class Player {

    private int  id;

    private long score;

    private String name;

    private int health;

    private int damage;

    private Item equippedItem;

    public Player(){

        System.out.println("nu har vi skapat objektet " + this + " med den 'tomma' konstruktorn");
    }

    public Player(String newName) {
        this.name = newName;
        this.health = 100;
        this.damage = 10;
//        System.out.println("nu har vi skapat objektet " + this.name + " med den 'andra' konstruktorn");
    }

    public void attack(Player otherPlayer){
        Random randomNumber = new Random();
        int damage = randomNumber.nextInt(this.damage - 2, this.damage + 3);
        int totalDamage = damage + this.equippedItem.getDamageModifier();

        System.out.println(this.name + " attacked " + otherPlayer.name + ". Dealing " + totalDamage  + " damage points");


        otherPlayer.takeDamage(totalDamage);
    }

    public void takeDamage(int damage){
        if(this.equippedItem.getArmorValue() > 0){
            this.damage -= this.equippedItem.getArmorValue();
            System.out.println(this.name + " blocked " +
                    this.equippedItem.getArmorValue() + " damage points with a " +
                    this.equippedItem.getName());
            System.out.println("The total damage is " + damage + " damage points");
        }
        this.health -= damage;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item getEquippedItem() {
        return equippedItem;
    }

    public void setEquippedItem(Item equippedItem) {
        this.equippedItem = equippedItem;
        System.out.println(this.name + " has found a " + this.equippedItem.getName());
        if(equippedItem.getHealthModifier() > 0){
            this.health += equippedItem.getHealthModifier();
            System.out.println(this.name + " has found a " + this.equippedItem.getName() + " gaining " + equippedItem.getHealthModifier() + " more health points");

        }
    }






}