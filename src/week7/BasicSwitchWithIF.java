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
public class BasicSwitchWithIF {
    public static void main(String[] args) {
        final int SELECTOR = 1;
        
        if(SELECTOR == 1){
            System.out.println("First case selected");
        }else if(SELECTOR == 2){
            System.out.println("Second case selected");
        }else if(SELECTOR == 3){
            System.out.println("Cases can match any int value");
        }else{
            System.out.println("Default case");
        }
    }
}