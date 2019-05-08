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
public class MarvelMovies {

    //create a new object marvelMovies using an array of strings
    public static void main (String[] args) {

        String[] MarvelMovies = new String[6];

        //filling array
        MarvelMovies[0]="Captain America: The Winter Soldier";
        MarvelMovies[1]="Captain America: Civil War";
        MarvelMovies[2]="Iron Man";
        MarvelMovies[3]="The Avengers";
        MarvelMovies[4]="Thor";
        MarvelMovies[5]="Guardians of the Galaxy";
        //forloop
        for (int i = 0; i <= 5; i=i+1){
            String accessedMarvelMovies = MarvelMovies[i];
            System.out.println("Accessed MarvelMovies: " + accessedMarvelMovies);

        } // Close forloop
    } // Close Main
} // Close Class
