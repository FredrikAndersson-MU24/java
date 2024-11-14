import enemies.*;
import items.Item;
import items.MeleeWeapon;
import items.RangedWeapon;
import items.UtilityItem;
import utility.InputHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private Player player;
    private List<Enemy> enemyList = new ArrayList<>();
    private List<Item> itemList = new ArrayList<>();

    public Game() {
    initItemList();
    initEnemyList();
    createPlayer();
    run();
    }

    public void run(){
        boolean running = true;
        while(running){
            printMenu();
            int input = InputHandler.getIntInRange(0,2);
            switch (input){
                case 1:
                    System.out.println(player.toString());
                    break;
                case 2:
                    initCombat();
                    break;

                case 0:
                System.out.println("Thanks for playing!");
                running = false;
                break;
            }
            if(player.getHealth() <= 0){
                running = gameOver();
            }
        }
    }

    public boolean gameOver(){
        System.out.println("GAME OVER!");
        System.out.println("Do you want to try again?");
        boolean choice = InputHandler.getBoolean();
        player.resetHealth();
        return choice;
    }



    public void createPlayer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        player = new Player(name);
    }

    public void printMenu(){
        System.out.println("\nWhat do you want to do?");
        System.out.println("1. Check status");
        System.out.println("2. Fight");
        System.out.println("3. Use an item");
        System.out.println("0. Exit");
    }

    public void initEnemyList(){
        enemyList.add(new Goblin(50,"Enemies.Goblin A", itemList.get(0)));
        enemyList.add(new Goblin(70,"Enemies.Goblin B", itemList.get(1)));
        enemyList.add(new GoblinArcher(50,"Enemies.Goblin Archer A", itemList.get(2)));
        enemyList.add(new GoblinArcher(70,"Enemies.Goblin Archer B", itemList.get(3)));
        enemyList.add(new GoblinAssassin(50, "Enemies.Goblin Assassin", itemList.get(4)));
    }

    public void initItemList(){
        itemList.add(new MeleeWeapon("Dagger", 10));
        itemList.add(new MeleeWeapon("Sword", 20));
        itemList.add(new RangedWeapon("Bow", 10));
        itemList.add(new RangedWeapon("Crossbow", 18));
        itemList.add(new UtilityItem("Health potion", 25));
    }

    public void initCombat(){
        Random rand = new Random();
        int i = rand.nextInt(itemList.size());
        Enemy enemy = enemyList.get(i);

        new Combat(this.player, enemy);

    }

}