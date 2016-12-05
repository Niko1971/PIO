package rzutkosciagra;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class rzutkosciagra {

    public static void main(String[] args) {

        Game game = new Game();
        Player player = new PlayerComp("Ziutek");
        game.addPlayer(player);
        Player player2 = new PlayerComp("Waldek");
        game.addPlayer(player2);
        Player player3 = new PlayerComp("Waldek");
        game.addPlayer(player3);
        Player player4 = new PlayerComp("Waldek");
        game.addPlayer(player4);
        game.displayPlayers();
        System.out.println("");
        game.start();
        game.display();
        /*
        List<Player> players = new ArrayList();
        players.add(player);
        Player p = players.get(0);
        System.out.println(p.guess());
         */
    }

}
