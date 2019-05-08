/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.util.Random;

/**
 *Methods help us avoid repeating code
 * @author jacob.merow
 */
public class RefactorTheRing {

    // chop main up and call the new methods as needed
    public static void main(String[] args) {
            
    int numViewersSwallowedByRing = 0;

        String viewer1 = "Katie";
        String viewer2 = "Josh";
        String viewer3 = "Rachel";
        String viewer4 = "Noah";
        String viewer5 = "Aiden";
    }// close main

    public static void watchFilm(String[] viewer) {

        System.out.println(viewer + " watched the tape; 7 days to live");
        System.out.println("****************************************");

        Random randomMachine = new Random();
        boolean madeCopy = randomMachine.nextBoolean();

        System.out.print("Did Viewer 1 named " + viewer + " make a copy? ");
        System.out.println(madeCopy);

        if(madeCopy){
            System.out.println(viewer + " is safe from The Ring!");
        } else {
            System.out.println("No copy made; " + viewer + " is toast");
        }
    } //close method
    // write and test your new methods here
} // close class