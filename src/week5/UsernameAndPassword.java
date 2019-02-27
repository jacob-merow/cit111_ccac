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
public class UsernameAndPassword{
    public static void main(String[] args){
        
        final String CORRECT_USERNAME = "javaghost";
        final String CORRECT_PASSWORD = "ic0d3";
        String enteredUsername;
        String enteredPassword;
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter your username folled by enter:");
        enteredUsername = Scan.next();
        System.out.println("Enter your password followed by enter:");
        enteredPassword = Scan.next();
        if(enteredUsername.equals(CORRECT_USERNAME) && enteredPassword.equals(CORRECT_PASSWORD)){
            System.out.println("Authentication Successful! You have logged in!");
        }else{
            System.out.println("Failure to authenticate!");
       }   
    }
}