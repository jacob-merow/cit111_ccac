/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jacob.merow
 */
public class BasicSwitchWithMethodCalls {
    public static void main(String[] args){
        
        Scanner Scan = new Scanner(System.in);
        
        int userType;
        
        System.out.println("***** switches and methods *****");
        System.out.println("Options:");
        System.out.println("1 - Print a special statement");
        System.out.println("2 - Generate a really big random number");
        System.out.println("3 - get me out of here!");
        System.out.println("Enter an int and press enter:");
        
        userType = Scan.nextInt();
        
        switch(userType){
            case 1:
                printStatement();
                break;
            case 2:
                generateBigNumber();
                break;
            case 3:
                break;
            default:
                System.out.println("Unknown selection....exiting");
        }
}
    
    public static void printStatement(){
        System.out.println("************INSIDE printStatement*************");
        System.out.println("Statement: Where There's a Will, There's a Way");
        System.out.println("**********************************************"); 
}

    public static void generateBigNumber(){
        System.out.println("*****INSIDE generateBigNumber*****");

        Random r = new Random();
        BigInteger bigInt = new BigInteger(100, r);
        
        System.out.println(bigInt);
        System.out.println("**********************************");
    }
}