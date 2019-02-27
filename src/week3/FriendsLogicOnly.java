    /*
 * Copyright (C) 2018 delores
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package week3;

import java.util.Scanner;

/**
 * Class to demonstrate implementation of if/else logic in context of an
 * activity that creates a chain of logic to assess friend compatability
 * 
 * @author delores the javabot
 */
public class FriendsLogicOnly {
    
    public static void main(String[] args) {

        int response_VideoGames;
        int compScore = 0;
        Scanner Scan = new Scanner(System.in);
        System.out.println("Do you play video games? (0 = no, 1 = yes)");
        response_VideoGames = Scan.nextInt();
        if(response_VideoGames == 1){
            compScore = compScore + 10; 
            System.out.println("Awesome1! Me too!");
        } else {
            System.out.println("...you might like it if you tried!");
        }            

        int response_Instrument;
        System.out.println("Do you play an Instrument? (0 = no, 1 = yes)");
        response_Instrument = Scan.nextInt();
        if(response_Instrument == 1){
                compScore = compScore + 10;
                System.out.println("Sweet!");
        } else {
            System.out.println("...you might like it if you tried!");
        }
        
        int response_Bacon;
        System.out.println("Do you like Bacon? (0 = no, 1 = yes)");
        response_Bacon = Scan.nextInt();
        if(response_Bacon == 0){
                compScore = compScore +10;
                System.out.println("Ya me neither!");
        } else {
            System.out.println("...That's to bad!");
        }
        
        int response_Hockey;
        System.out.println("Do you like Hockey? (0 = no, 1 = yes)");
        response_Hockey = Scan.nextInt();
        if(response_Hockey == 1){
                compScore = compScore +10;
                System.out.println("Nice!");
        if(response_Hockey == 0){
                compScore = compScore -50;
        }
        } else {
            System.out.println("...you might like it if you tried!");
        }
        
        int response_Baseball;
        System.out.println("Do you like Baseball? (0 = no, 1 = yes)");
        response_Baseball = Scan.nextInt();
        if(response_Baseball == 0){
                compScore = compScore +20;
                System.out.println("Thank goodness!");
        } else {
            System.out.println("...That's to bad!");
        }

        if(compScore > 40){
            System.out.println("Great, we might be friends!");
        } else {
            System.out.println("Yikes, according to my decision tree, "
                    + "we probably wouldn't make good friends.");
        }
    }
}
