package show;

import person.Actor;
import person.Director;

import java.util.ArrayList;

public class Show {
    private String title;
    private double duration;
    private Director director;
    private ArrayList<Actor> listOfActors;
    private ShowType showType = ShowType.CLASSIC_SHOW;

    public Show(String title, double duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public ShowType getShowType() {
        return showType;
    }

    public void printListOfActors() {
        System.out.println("Список актеров представления типа " + returnShowTypeName(getShowType()) + ":");
        for(Actor actor : listOfActors) {
            System.out.println(actor.getFirstName() + " " + actor.getLastName() + " (" + actor.getHeight()+ "см.)");
        }
        System.out.println();
    }

    public void printDirectorInfo() {
        System.out.println("Информация про режиссера представления типа " + returnShowTypeName(getShowType()) + ":");
        System.out.println(director.toString());
        System.out.println();
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("В представлении типа " + returnShowTypeName(getShowType())+ " актер " + actor.getLastName() + " уже есть в списке!");
            System.out.println();
        } else {
            listOfActors.add(actor);
        }
    }

    public void changeActor(Actor newActor, String oldActorSurname) {
        for (Actor actor : listOfActors) {
            if (actor.getLastName().equals(oldActorSurname)) {
                listOfActors.remove(actor);
                addActor(newActor);
                System.out.println("В представлении типа " + returnShowTypeName(getShowType()) + " актёр " + oldActorSurname + " заменён на актёра " + newActor.getLastName());
                System.out.println();
                return;
            }
        }

        System.out.println("В представлении типа " + returnShowTypeName(getShowType())+ " актера " + oldActorSurname + " нет в списке!");
        System.out.println();
    }

    protected String returnShowTypeName(ShowType showType) {
        switch (showType) {
            case ShowType.BALLET:
                return "балет";
            case ShowType.OPERA:
                return "опера";
            default:
                return "обычный спектакль";
        }
    }
}
