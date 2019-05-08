/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 * Client class of our Donut class
 *  We make instances of Donut objects
 *  and populate their member variables
 * @author jacob.merow
 */
public class DonutLand {
    public static void main(String[] args) {
        // make (i.e. "instantiate") a Donut
        // and store a reference to that Object
        // in variable called firstDonut
        // of type Donut
        Donut firstDonut = new Donut();
        firstDonut.name = "Anna";
        firstDonut.hasHole = true;
        firstDonut.percRemaining = 100;
        firstDonut.size = "Normal";
        firstDonut.eatDonut(15);
        printDonutStats(firstDonut);
        // firstDonut should have 90% left

        // instantiate your second Donut
        // populate its member variable
        // with proper values

        Donut secondDonut = new Donut();
        secondDonut.name = "Axel";
        secondDonut.hasHole = false;
        secondDonut.percRemaining = 100;
        secondDonut.size = "Normal";
        secondDonut.eatDonut(0);
        printDonutStats(secondDonut);

    } // close main
    
    public static void printDonutStats(Donut d) {
        
        System.out.println("Perc remaing if "
                + d.name + " is " + d.getPercentRemaining()
                + "%");

        
    } // close method
} // close class