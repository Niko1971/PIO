package rzutkosciagra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Game {

    private List<Player> players = new ArrayList();
    private Player player;

    public void displayPlayers() {
 /*       for (int i=0;i<players.size();i++)
        {
            Player p = players.get(i);
            System.out.println(p.getName());
        }*/
 
 //to u góry = to na dole
 
// for (Player p:players){
  //         System.out.println(p.getName());
      // }
      
      Iterator<Player> it = players.iterator();
      while (it.hasNext()){
          Player p = it.next();
     
          System.out.println(p.getName());      }
    }

    public void addPlayer(Player player) {
        this.player = player;
        players.add(player);
    }

    int dice = 0, guess = 0;
    Random random = new Random();

    public void start() {

        do {
            guess = player.guess();
            dice = random.nextInt(6) + 1;
            System.out.println("Game Master Rools: " + dice + "\n " + player.getName() + " guess: " + guess);
            if (dice != guess) {
                System.out.println("Gracz nie zgadl! Losujemy jeszcze raz!\n");
            }
        } while (dice != guess);
        System.out.println("Numer odgadniety, koniec gry!");
    }
}











/*try {
            player.setName("");
        } catch (IllegalArgumentException ex) {
            System.err.println("Błąd " + ex.getMessage());
        }*/
