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
public class VolumeOfACylinder {
    public static void main(String[] args){
        
        System.out.print("Enter the cylinder radius:");
        double userRadius = scan.nextDouble();
        System.out.println("Enter the cylinder height");
        double userHeight = scan.nextDouble();
        
        System.out.println();
        
    }
    
    public static double calcVolumeOfCylinder(double raidius, double height){
        final double PI = 3.1416;
        double radius = 0;
        double cylVol = PI * (radius * radius) * height;
        return cylVol;
    }
}
