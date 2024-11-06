import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Game game = new Game();


    }



    public static void storingExample1(){
        ArrayList<Player> playerList = new ArrayList<>();

        Player p = new Player("John");
        Player p1 = new Player();

        Player p2 = p1;

        playerList.add(p);
        playerList.add(p1);
        playerList.add(p2);
        playerList.add(p);

        for (Player player : playerList) {
            System.out.println(player);
        }
    }
}