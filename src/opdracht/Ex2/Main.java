package opdracht.Ex2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavilion on 30-5-2016.
 */
public class Main {
    public static void main(String[] args) {
        MusicLibraryVisitor Music = new MusicLibraryVisitor();
        List<ISong> songs = new ArrayList<ISong>();
        songs.add(new HeavyMetal("Hallowed Be Thy Name"));
        songs.add(new Jazz("Autumn Leaves"));
        songs.add(new HeavyMetal("War Pigs"));
        songs.add(new HeavyMetal(""));
        for (ISong song : songs) {
            song.visit(Music);
        }

        System.out.println("Amount of heavy metal music: " + Music.heavyMetal.size());
        System.out.println("Amount of jazz music: " + Music.jazz.size());

        //OPTION VISITOR version 1
    }
}