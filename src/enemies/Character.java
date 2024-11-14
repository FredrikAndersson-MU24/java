package enemies;

public abstract class Character {

    private int health;
    private String name;
    private int maxHealth;

    public Character(int health, String name) {
        this.health = health;
        this.maxHealth = health;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(this.getName() + " health is now " + this.getHealth());

    }

    public void died(){
        System.out.println(this.name + " died...");
    }

    public abstract boolean performAction(Character target);

    public void increaseHealth(int healthBoost) {
        this.health += healthBoost;
        System.out.println("healthBoost = " + healthBoost);
    }
    public void resetHealth(){
        this.health = this.maxHealth;
    }

}
