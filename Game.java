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
        System.out.print("Zadeklarowani gracze: ");
        System.out.println("");

        Iterator<Player> it = players.iterator();

        while (it.hasNext()) {
            Player p = it.next();

            System.out.println(p.getName());
        }
    }

    public void addPlayer(Player player) {
        String name = player.getName();
        if (isNameUnique(name)) {
            players.add(player);
            stats.addPlayer(player);
        } else {
            name += String.valueOf(Math.round(Math.random() * 9));
            player.setName(name);
            addPlayer(player);
        }
    }

    
    
    private boolean isNameUnique(String name) {
        for (Player p : players) {
            if (p.getName().equals(name)) {
                return false;
            }
        }
        return true;
    }

    int dice = 0, guess = 0;
    Random random = new Random();

    public void start() {
        Random dice = new Random();
        int number, guess;
        boolean repeat;
        do {
            repeat = true;
            number = dice.nextInt(6) + 1;
            System.out.println("Komputer wylosowal : " + number);

            for (Player player : players) {
                guess = player.guess();

                System.out.println(player.getName() + " wylosowal " + guess);
                if (number == guess) {
                    repeat = false;
                    stats.winner(player);
                    System.out.println("Numer odgadniety, koniec gry! \n");

                } else {
                    System.out.println("Gracz nie zgadl! Losujemy jeszcze raz!\n");
                }
            }
        } while (repeat);

    }
    
    private Statistics stats = new Statistics();
}
