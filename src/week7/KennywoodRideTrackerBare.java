/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.util.Random;

/**
 *
 * @author jacob.merow
 */
public class KennywoodRideTrackerBare {

        static int totalRiders = 0;
        static int totalFailedRideAttempts = 0;
        static int totalSickRiders = 0;

        final static int MIN_THRILLHEIGHT_IN = 62;
        final static int MIN_THEMEHEIGHT_IN = 54;

    public static void main(String[] args) {
        
        System.out.println("Begin Ride Simulation");
        printRiderStats();
        rideBlackWidow(10, 64);
        printRiderStats();
        
        rideMerryGoRound(10, 64);
        printRiderStats();
        
    }//close main

    public static void rideBlackWidow(int riders, int avgHeight) {

        if(avgHeight >= MIN_THRILLHEIGHT_IN){
            System.out.println("Riding Black Widow!");
            System.out.println("I HAAAATE SPIIIIIDEEEERS!");
            totalRiders = totalRiders + riders;
            Random rand = new Random();
            int numSickRiders = rand.nextInt(riders);
            totalSickRiders = totalSickRiders + numSickRiders;
        }else{
            System.out.println(riders + "riders turned away crying: too short!");
            totalFailedRideAttempts = totalFailedRideAttempts + riders;
        }//end if/else
    }//close method

    public static void rideMerryGoRound(int riders, int avgHeight) {

        if(avgHeight >= MIN_THRILLHEIGHT_IN){
            System.out.println("Riding Merry-Go-Round!");
            System.out.println("Round...and round...and round");
            totalRiders = totalRiders + riders;
            Random rand = new Random();
            int numSickRiders = rand.nextInt(riders);
            totalSickRiders = totalSickRiders + numSickRiders;
        }else{
            System.out.println(riders + "riders turned away crying: too short!");
            totalFailedRideAttempts = totalFailedRideAttempts + riders;
        }//end if/else
    }//close method

    public static void printRiderStats() {

        System.out.println("*******RIDER STATS*********");
        System.out.println("Total Riders: " + totalRiders);
        System.out.println("Total Failed Ride Attempts: " + totalFailedRideAttempts);
        System.out.println("Total Sick Riders: " + totalSickRiders);
        System.out.println("***************************");

    }//close method
}//close class
