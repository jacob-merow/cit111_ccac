/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_project_done;

/**
 *
 * @author jacob.merow
 */
public class AlbumLand {

    /**
     * Sets up the album chart with all the info
     * @param args 
     */
    public static void main (String[] args) {

        ModelAlbum Album = new ModelAlbum();
        Album.BandName = "Memphis May Fire";
        Album.AlbumName = "Sleepwalking";
        Album.AlbumLength = 35;
        Album.Genre = "Rock";
        Album.YearMade = 2009;
        Album.SongTitle1 = "North Atlantic Vs North Carolina    3:44";
        Album.SongTitle2 = "A Giant In a Giant's World          3:14";
        Album.SongTitle3 = "You're Lucky It's Not 1692          3:41";
        Album.SongTitle4 = "Ghost In The Mirror                 3:54";
        Album.SongTitle5 = "Been There, Done That               3:30";
        Album.SongTitle6 = "Quantity Is Their Quality           3:29";
        Album.SongTitle7 = "Sleepwalking                        3:47";
        Album.SongTitle8 = "Destiny for the Willing             3:06";
        Album.SongTitle9 = "The Face With No Name               3:11";
        Album.SongTitle10 = "Speak Now, I'm Listening            3:41";

        displayAlbumStats(Album);

    } // Close Main

    /**
     * Creates the stats of the album and turns them into outputs
     * @param anyAlbumObject 
     */
    public static void displayAlbumStats(ModelAlbum anyAlbumObject) {

        System.out.println("Band: " + anyAlbumObject.BandName);
System.out.println();
        System.out.println("Album: " + anyAlbumObject.AlbumName);
System.out.println();
        System.out.println("Genre: " + anyAlbumObject.Genre);
        System.out.println("Year: " + anyAlbumObject.YearMade);
        System.out.println("Album Length: " + anyAlbumObject.AlbumLength + " minutes");
System.out.println();
        System.out.println("Songs:");
        System.out.println("1  " + anyAlbumObject.SongTitle1);
        System.out.println("2  " + anyAlbumObject.SongTitle2);
        System.out.println("3  " + anyAlbumObject.SongTitle3);
        System.out.println("4  " + anyAlbumObject.SongTitle4);
        System.out.println("5  " + anyAlbumObject.SongTitle5);
        System.out.println("6  " + anyAlbumObject.SongTitle6);
        System.out.println("7  " + anyAlbumObject.SongTitle7);
        System.out.println("8  " + anyAlbumObject.SongTitle8);
        System.out.println("9  " + anyAlbumObject.SongTitle9);
        System.out.println("10 " + anyAlbumObject.SongTitle10);
System.out.println();
    } // Close Method
} // Close Class