public abstract class Character {

    private int health;
    private String name;

    public Character(int health, String name) {
        this.health = health;
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

    public abstract boolean performAction(Character target);

}
