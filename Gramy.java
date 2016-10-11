package gramy;

import java.util.*;

public class Gramy {

    public static void main(String[] args) {
        Random r = new Random();
        int a, b;
        do {
            a = r.nextInt(6) + 1;
            b = r.nextInt(6) + 1;
            System.out.println("Wylosowano liczbe " + a);
            System.out.println("Twoja liczba " + b);
            if (a == b) {
                System.out.println("Trafiles!");
            } else {
                System.out.println("Nie trafiles!");
            }
        } while (a != b);
    }

}
