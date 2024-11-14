package items;

import enemies.Character;

public class MeleeWeapon extends Weapon {


    public MeleeWeapon(String itemName, int damage) {
        super(itemName, damage);
    }

    @Override
    public Item getCopy(){
        return new MeleeWeapon(this.getItemName(), this.getDamage());
    }

    @Override
    public void useItem(Character target) {
        System.out.println("using " + this.getItemName() + " on " + target.getName());
    }

}
