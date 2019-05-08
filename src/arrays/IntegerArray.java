/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author jacob.merow
 */
public class IntegerArray {

    public static void main(String [] args) {

        int[] writingInstruments = new int[5];

        writingInstruments[0] = 15;
        writingInstruments[1] = 19;
        writingInstruments[2] = 5;
        writingInstruments[3] = 16;
        writingInstruments[4] = 14;

    } // Close Main  

    public static void printNumericArrayWithWhileLoop(int[] intArray) {

        System.out.println("");
        System.out.println("********* ACCESSING ARRAY WITH WHILE() LOOP *********");

        int i = 0;

        int arraySize = intArray.length;

        while(i < arraySize) {

            System.out.println("Number instruments in beaker indexed at " 
                     + i + ": " + String.valueOf(intArray[i]));
                
            i = i + 1;
                
        } // Close While
    } // Close Method
} // Close Class
