package items;

import enemies.Character;

public interface RangedUnit {

    void rangedAttack(Character target);

    double getRange();

}
