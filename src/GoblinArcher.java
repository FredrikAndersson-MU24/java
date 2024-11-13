public class GoblinArcher extends Enemy implements RangedUnit{
    private double range;

    public GoblinArcher(int health, String name, Item item) {
        super(health, name, item);
        this.range = 50;
    }

    @Override
    public  boolean performAction(Character target) {
        super.performAction(target);
        return true;
    }

    @Override
    public void rangedAttack(Character target) {

    }

    @Override
    public double getRange() {
        return this.range;
    }
}
