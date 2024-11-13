import java.util.Random;

public class Combat {

    private Player player;
    private Enemy enemy;
    private Character currentCharacter;
    private Character otherCharacter;


    public Combat(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
        Random  random = new Random();
        if (random.nextBoolean()){
            currentCharacter = player;
            otherCharacter = enemy;
        } else { currentCharacter = enemy;
            otherCharacter = player;
        }
        run();
    }

    public void run(){
        presentCombatants();
        boolean running = true;
        while (running){
            running = currentCharacter.performAction(otherCharacter);
            if(currentCharacter instanceof Player){
                currentCharacter = this.enemy;
                otherCharacter = this.player;
            } else {
                currentCharacter = this.player;
                otherCharacter = this.enemy;
            }
        }


    }

    public void presentCombatants(){
        System.out.println("You are facing a " + enemy.getName());
        System.out.println(currentCharacter.getName() + " starts!");
    }

}
