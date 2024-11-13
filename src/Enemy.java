import java.util.Random;

public abstract class Enemy extends Character{
    private Item item;

    public Enemy(int health, String name, Item item) {
        super(health, name);
        this.item = item;
    }

    @Override
    public boolean performAction(Character target) {
//        System.out.println(this.getName() + " is grinning");
        System.out.println(this.getName() + " attacks " + target.getName() + "!");
        Random rand = new Random();
        int variance = rand.nextInt(-2, 3);
        target.takeDamage(5+variance);
        return true;
    };

    @Override
    public String toString() {
        return super.getName();
    }
}
