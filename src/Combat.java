import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Combat {

        private ArrayList<Item> itemList = new ArrayList<>();

        private Scanner scanner = new Scanner(System.in);
        private Player player1;
        private Player player2;
        private Player currentPlayer;

        public Combat(Player player1, Player player2) {
            this.player1 = player1;
            this.player2 = player2;

            this.currentPlayer = player1;
            generateItems();
            this.combatLoop();
        }


        public void combatLoop(){
            boolean running = true;
            player1.setEquippedItem(getRandomItem());
            player2.setEquippedItem(getRandomItem());
            while(running){
                if(currentPlayer.equals(player1)){
                    player1.attack(player2);
                } else {
                    player2.attack(player1);
                }
                System.out.println(player1.getName() +  "'s health is " + player1.getHealth());
                System.out.println(player2.getName() +  "'s health is " + player2.getHealth());
                if(currentPlayer.equals(player1)){
                    currentPlayer = player2;
                } else {
                    currentPlayer = player1;
                }
                scanner.nextLine();
                if(currentPlayer.getHealth() <= 0){
                running = false;
                }

            }
        }


        public void generateItems(){

            itemList.add(new Item("shield", 0, 5, 0));
            itemList.add(new Item("dagger", 2, 0, 0));
            itemList.add(new Item("golden apple", 0, 0, 20));
            itemList.add(new Item("sword", 5, 0, 0));

        }

        public Item getRandomItem(){
            Random randomItem = new Random();
            return itemList.get(randomItem.nextInt(0, itemList.size()));
        }

}
