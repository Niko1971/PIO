package rzutkosciagra;

import java.util.Scanner;

public class PlayerHuman extends Player {

    private Scanner scanner = new Scanner(System.in);

    public PlayerHuman() {

    }

    public PlayerHuman(String name) {
        super(name);
    }

    public int guess() {
        System.out.println("Pick your numer!");
        return scanner.nextInt();

    }
}
