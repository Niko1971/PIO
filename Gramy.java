package gramy;

import java.util.*;
import gramy.Player;
import gramy.PlayerHuman;
import gramy.PlayerComp;

public class Gramy {

    public static void main(String[] args) {
        Random r = new Random();
        PlayerComp player = new PlayerComp();
        int a, b;

        do {
            int suma = player.guess();
            a = r.nextInt(6) + 1;
            System.out.println("Wylosowano liczbe " + a);
            System.out.println("Twoja liczba " + suma);
            b = suma;
            if (a == suma) {
                System.out.println("Trafiles!");
            } else {
                System.out.println("Nie trafiles! \n");
            }
        } while (a != b);
    }

}
