/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2_basics;

import java.util.Scanner;

/**
 *
 * @author jacob.merow
 */
public class Tabulator {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int totalRespondents = 0;
        int numAndroidUsers = 0;
        int numAppleUsers = 0;
        
        System.out.println("PHONE USERS SURVEY");
        
        while(true){
            System.out.println(">>>>>>>>>>QUESTION<<<<<<<<<<");
            System.out.println("Do you regularly use Android or Apple?");
            System.out.println("(Enter 1 for Android and 0 for Apple)");
            
            int userResponse = scanner.nextInt();
            
            if(userResponse == 1){
            if(userResponse == 0)
                
                numAndroidUsers = numAndroidUsers + 1;
                System.out.println("Yeaaah!");
                numAppleUsers = numAppleUsers  + 1;
                System.out.println("Yeaaah!");
            } else{
                System.out.println("[sad face]");
            }
            
            totalRespondents = totalRespondents + 1;
            
            System.out.println("**********SUMMARY**********");
            System.out.println(totalRespondents + " folks have responded.");
            System.out.println(numAndroidUsers + " report(s) regularly using Linux.");
            double linuxDouble = (double) numAndroidUsers;
            double totalDouble = (double) totalRespondents;
            double percentUsers = (linuxDouble/totalDouble) * 100;
            System.out.println("This translates into a use percentage of: " + percentUsers + "%");
            
        }    
    }
}
