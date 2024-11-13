import java.util.Random;

public class Player extends Character{


    public Player(String name) {
        super(100, name);
    }

    @Override
    public boolean performAction(Character target) {
        printActions();
        int input = InputHandler.getIntInRange(0,2);
        if (input == 1) {
            punch(target);
        } else if (input == 0) {
            System.out.println("Flee");
            return false;
        }
        return true;
    }

    public void printActions(){
        System.out.println("What do you want to do?");
        System.out.println("1. Punch!");
        System.out.println("2. Punch again");
        System.out.println("0. Flee");
    }


    public void punch(Character enemy){
        System.out.println(this.getName() + " is punching " + enemy.getName());

        Random rand = new Random();
        int variance = rand.nextInt(-2, 3);
        enemy.takeDamage(5+variance);

    }



    @Override
    public String toString() {
        return  "Name: " + super.getName() +
                "\nHealth: " + super.getHealth();
    }





}
