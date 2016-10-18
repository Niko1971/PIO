/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gramy;

import java.util.*;

/**
 *
 * @author Student
 */
public class PlayerHuman extends Player {

    Scanner klawiatura = new Scanner(System.in);

    @Override
    public int guess() {
        int d = klawiatura.nextInt();
        return d;
    }

}
