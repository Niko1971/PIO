package rzutkosciagra;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RZUTKOSCIAGRA {

    public static void main(String[] args) {
        
        Player player = new PlayerComp("Ziutek");
        
        Game game = new Game();
        game.addPlayer(player);
        Player player2 = new PlayerComp("Waldek");
        game.addPlayer(player2);
        game.displayPlayers();
        //game.start();
  
        List<Player> players = new ArrayList();
        players.add(player);
        //players.add("buu");
        //players.add(game);
        Player p = players.get(0);
        System.out.println(p.guess());
    
    }

    
}
