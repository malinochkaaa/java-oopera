package show;

import person.Actor;
import person.Director;
import person.Person;

import java.util.ArrayList;

public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(
            String title,
            double duration,
            Director director,
            ArrayList<Actor> listOfActors,
            Person musicAuthor,
            String librettoText,
            int choirSize
    ) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    @Override
    public ShowType getShowType() {
        return ShowType.OPERA;
    }
}
