/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

/**
 *
 * @author jacob.merow
 */
public class BasicSwitch {
    public static void main(String[] args) {
        final int SELECTOR = 1;
        
        switch(SELECTOR){
            case 1: 
                System.out.println("First case selected");
                break;
            case 2:
                System.out.println("Second case selected");
                break;
            case 3:
                System.out.println("Cases can match any int value");
                break;
            default:
                System.out.println("Default case");
        }
    }
}