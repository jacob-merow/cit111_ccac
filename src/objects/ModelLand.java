/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author jacob.merow
 */
public class ModelLand {

    public static void main (String[] args) {

        ModelCar car = new ModelCar();
        car.color = "Yellow";
        car.name = "Subaru";
        car.modelNumber = 9812000;
        car.numWindows = 4;

        displayCarStats(car);

    } // Close Main

    public static void displayCarStats(ModelCar anyCarObject) {

        System.out.println("***** STATS *****");
        System.out.println(anyCarObject.color + " " + anyCarObject.name);
        System.out.println("Windows up? " + anyCarObject.getWindowStatus());
        System.out.println("Model Number " + anyCarObject.modelNumber);
        System.out.println("*****************");
    } // Close Method
} // Close Class
