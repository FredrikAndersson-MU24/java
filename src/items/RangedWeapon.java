package items;

import enemies.Character;

public class RangedWeapon extends Weapon implements Consumable {


    public RangedWeapon(String itemName, int damage) {
        super(itemName, damage);
    }

    @Override
    public Item getCopy(){
        return new RangedWeapon(this.getItemName(), this.getDamage());
    }

    @Override
    public void useItem(Character target) {

    }

}
