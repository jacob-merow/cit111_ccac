/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;

/**
 *
 * @author jacob.merow
 */
public class RiderHeightProgram {
    public static void main(String[] args){
        
        int MIN_HEIGHT_CM = 137;
        int RiderHeight1;
        int RiderHeight2;
        Scanner Scan = new Scanner(System.in);
        System.out.println("The minimum height requirement to ride is 137cm");
        System.out.println("What is both of your heights?");
        RiderHeight1 = Scan.nextInt();
        RiderHeight2 = Scan.nextInt();
        if(RiderHeight1 >= MIN_HEIGHT_CM && RiderHeight2 >= MIN_HEIGHT_CM){
            System.out.println("You are tall enough to ride this ride, have fun!");
        }else{
            System.out.println("Sorry you are to short to ride the Phantom Train");
        }
    }
}