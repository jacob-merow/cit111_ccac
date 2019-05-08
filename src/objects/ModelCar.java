/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 * Blueprint Class
 * @author jacob.merow
 */
public class ModelCar {

    String color;
    String name;
    int numWindows;
    int modelNumber;
    private boolean windowStatus;

    /**
     * Simulates having the windows closed 
     */
    public void windowsUp() {

        windowStatus = true;
        System.out.println("Windows stay closed");

    }

    /**
     * Simulates having the windows open
     */
    public void windowsDown() {

        windowStatus = false;
        System.out.println("Windows roll down");

    }

    public boolean getWindowStatus() {

        return windowStatus;
    }
}