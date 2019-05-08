/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.util.Scanner;

/**
 *
 * @author jacob.merow
 */
public class GeometricShapes {
    public static void main(String[] args) {
        
        Scanner Scan = new Scanner(System.in);
        
        System.out.println("Enter the side length of the cube to calculate its volume:");
        double sideLength = Scan.nextDouble();
        
        double returnedVolume = calcVolumeOfCube(sideLength);
        
        System.out.println("The volume of a cube with side length" + sideLength + 
                " is " + returnedVolume);
        System.out.println("--------------------------------------------------");

    }

    public static double calcVolumeOfCube(double sideLength) {
        double cubeVolume = Math.pow(sideLength, 3);
        return cubeVolume;
    }
}
