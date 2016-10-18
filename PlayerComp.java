/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gramy;

import java.util.Random;

/**
 *
 * @author Student
 */
public class PlayerComp extends Player {

    Random r = new Random();

    public int guess() {
        int guess;
        guess = r.nextInt(6) + 1;
        return guess;
    }

}
