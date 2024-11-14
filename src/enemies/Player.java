package enemies;

import items.Buff;
import items.Item;
import items.Offense;
import utility.InputHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player extends enemies.Character {

    private List<Item> inventory = new ArrayList<>();

    private Item equippedItem;


    public Player(String name) {
        super(100, name);
    }

    @Override
    public boolean performAction(enemies.Character target) {
        printActions();
        int input = InputHandler.getIntInRange(0,2);

        switch (input) {
            case 1:
                punch(target);
                break;
            case 2:
                useItem(target);
                break;
            case 0:
                System.out.println("Flee");
                return false;
        }
        return true;
    }

    public void printActions(){
        System.out.println("\nWhat do you want to do?");
        System.out.println("1. Punch!");
        System.out.println("2. UseItem!");
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
                "\nHealth: " + super.getHealth() +
                "\nInventory: " + inventory;
    }


    public List<Item> getInventory() {
        return inventory;
    }

    public void useItem(Character target){
        if(inventory.size() == 0){
            return;
        }
        System.out.println("Choose an item:");
        for(int i = 0; i < inventory.size(); i++){
            System.out.println(i+1 + ": " + inventory.get(i));
        }
        int input = InputHandler.getIntInRange(1,inventory.size());
        inventory.get(input-1).useItem(target);
        Item currentItem = inventory.get(input-1);
        if(currentItem instanceof Buff){
            currentItem.useItem(this);
        }
        if(currentItem instanceof Offense){
            currentItem.useItem(target);
        }

    }
}
