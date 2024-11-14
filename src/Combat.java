import enemies.Character;
import enemies.Enemy;
import enemies.Player;
import utility.InputHandler;

import java.util.Random;

public class Combat {

    private Player player;
    private Enemy enemy;
    private enemies.Character currentCharacter;
    private enemies.Character otherCharacter;


    public Combat(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
        Random  random = new Random();
        if (random.nextBoolean()){
            currentCharacter = player;
            otherCharacter = enemy;
        } else {
            currentCharacter = enemy;
            otherCharacter = player;
        }
        run();
    }

    public void run(){
        presentCombatants();
        boolean running = true;
        while (running) {
            running = currentCharacter.performAction(otherCharacter);

            if (!checkHealth(player)) {
                player.died();
                break;
            }

            if (!checkHealth(enemy)) {
                player.died();
                getItem();
                break;
            }

            if (currentCharacter instanceof Player) {
                currentCharacter = this.enemy;
                otherCharacter = this.player;
            } else {
                currentCharacter = this.player;
                otherCharacter = this.enemy;
            }

        }
        enemy.resetHealth();

    }

    public boolean checkHealth(Character character){
        if(character.getHealth() <= 0 ){
            return false;
        }  else {
            return true;
        }
    }

    public void presentCombatants(){
        System.out.println("You are facing a " + enemy.getName());
        System.out.println(currentCharacter.getName() + " starts!");
    }

    public void getItem(){
        System.out.println(enemy.getName() + " dropped " + enemy.getItem().getItemName() +
                ". Do you want to pick it up? Y/N");
        if(InputHandler.getBoolean()){
            player.getInventory().add(enemy.getItem().getCopy());
        }

    }

}
