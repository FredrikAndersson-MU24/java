package enemies;

import items.Item;
import items.MeleeUnit;

import java.util.Random;

public class Goblin extends Enemy implements MeleeUnit {


    public Goblin(int health, String name, Item item) {
        super(health, name, item);
    }

    @Override
    public  boolean performAction(Character target) {
        Random random = new Random();
        int r = random.nextInt(0,100);
        if(r < 20) {
            super.performAction(target);
        } else if(r < 50) {
            meleeAttack(target);
        } else {
            System.out.println(this.getName() + " is grinning...!");
        }


        return true;
    }

    @Override
    public void meleeAttack(Character target) {
        System.out.println(this.getName() + " is performing its special attack...");
        target.takeDamage(30);
    }
}
