package enemies;

import items.Item;
import items.MeleeUnit;
import items.RangedUnit;

public class GoblinAssassin extends Enemy implements MeleeUnit, RangedUnit {
    private double range;

    public GoblinAssassin(int health, String name, Item item) {
        super(health, name, item);
        this.range = 100;
    }

    @Override
    public  boolean performAction(Character target) {
        super.performAction(target);
        return true;
    }

    @Override
    public void meleeAttack(Character target) {

    }

    @Override
    public void rangedAttack(Character target) {

    }

    @Override
    public double getRange() {
        return this.range;
    }
}
