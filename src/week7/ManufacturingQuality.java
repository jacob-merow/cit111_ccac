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
public class ManufacturingQuality {
        final static int MAX_QUALITY = 100;
        final static int QUALITY_THRESHOLD = 50;
        final static int UNITS_TO_MAKE = 5;
        
        static int unitQuality = 0;
        static int totalFailures = 0;
        static int totalUnitsMade = 0;
        
        public static void main(String[] args){    
        
        Random randGenerator = new Random();
        while(totalUnitsMade < UNITS_TO_MAKE){
        unitQuality = randGenerator.nextInt(MAX_QUALITY + 1);
        System.out.println("Unit Quality: " + unitQuality);

            totalUnitsMade = totalUnitsMade + 1;
            
            if(unitQuality < QUALITY_THRESHOLD){
                System.out.println("Unit below quality test");
                totalFailures = totalFailures + 1;
            } else{
                System.out.println("Unit passes quality test");
            }
            
            System.out.println("Total failures: " + totalFailures + 
                    " out of " + totalUnitsMade + " units made");
        }
        
        double productionRatio = (double)totalFailures /
                (double)totalUnitsMade;
        
        System.out.println("***PRODUCTION SUMMARY***");
        System.out.println("Tested " + totalUnitsMade + " Units.");
        System.out.println("Failure Ratio: " + productionRatio);
    }
}