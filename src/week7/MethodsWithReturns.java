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
public class MethodsWithReturns{
    public static void main(String[] args){

        int initialNumber = 100;
        doubleAValue(initialNumber);
        int returnedValue = doubleAValue(initialNumber);
        System.out.println("Value returned: " + returnedValue);
    }

     //a method takes in an integer, doubles it, and returns results.

    public static int doubleAValue(int value){

        int result = value * 2;
        return result;
    }
}
