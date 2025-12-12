package show;

import person.Actor;
import person.Director;
import person.Person;

import java.util.ArrayList;

public class MusicalShow extends Show {
    private Person musicAuthor;
    private String librettoText;

    public MusicalShow(
            String title,
            double duration,
            Director director,
            ArrayList<Actor> listOfActors,
            Person musicAuthor,
            String librettoText
    ) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println("Текст либретто представления типа " + getShowType().getDisplayName() + ":");
        System.out.println(librettoText);
        System.out.println();
    }
}
