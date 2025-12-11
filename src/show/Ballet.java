package show;

import person.Actor;
import person.Director;
import person.Person;

import java.util.ArrayList;

public class Ballet extends MusicalShow {
    private Person choreographer;

    public Ballet(
            String title,
            double duration,
            Director director,
            ArrayList<Actor> listOfActors,
            Person musicAuthor,
            String librettoText,
            Person choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    @Override
    public ShowType getShowType() {
        return ShowType.BALLET;
    }
}
