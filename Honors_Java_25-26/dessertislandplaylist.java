//Sanhith Vandara 
//Honors Java 
//Mrs Scullin 
//feb 10 


//import java arrays
import java.util.ArrayList;

public class DesertIslandPlaylist {
    public static void main(String[] args) {

        // create ArrayList
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

        // add songs (6)
        desertIslandPlaylist.add("The Code- Polo G & King Von");
        desertIslandPlaylist.add("Bandit - Juice WRLD & NBA YoungBoy");
        desertIslandPlaylist.add("Look at Me! - XXXTENTACION");
        desertIslandPlaylist.add("Took Her To The O - King Von");
        desertIslandPlaylist.add("Grace - Lil Baby & 42 Dugg");
        desertIslandPlaylist.add("Nuketown - Ski Mask the Slump God");

        // print playlist
        System.out.println(desertIslandPlaylist.toString());

        // remove one song and print size
        desertIslandPlaylist.remove(5);
        System.out.println(desertIslandPlaylist.size());

        // swap first and last songs
        desertIslandPlaylist.set(0, "Martin & Gina - Polo G");
        desertIslandPlaylist.set(4, "Crazy Story - King Von");

        //print final playlist
        System.out.println(desertIslandPlaylist.toString());
    }
}
