/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 * "Blueprint" class that models
 * a real-world donut; no main method
 * @author jacob.merow
 */
public class Donut {
    // Member Variables
    // Each instance of the donut class
    // will receive 
    //
    String name;
    int percRemaining;
    String size;
    boolean hasHole;

    /**
     * Simulates eating some percent of this
     * donut
     * @param percentEaten 
     */
    public void eatDonut(int percentEaten) {

       percRemaining  = percRemaining - percentEaten;

    } // close method

    /**
     * Accessor method for retrieving the value
     * of the member variable: percRemaining;
     * @return 
     */
    public int getPercentRemaining() {

        return percRemaining;

    } // close method
} // close class
