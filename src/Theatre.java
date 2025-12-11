import person.*;
import show.Ballet;
import show.Opera;
import show.Show;

import java.util.ArrayList;
import java.util.Random;

public class Theatre {
    public static void main(String[] args) {
        final String BALLET_LIBRETTO_TEXT = "История о превращении, чуде и силе мечты, рассказанная языком движения и света.";
        final String OPERA_LIBRETTO_TEXT = "Музыкальная драма о борьбе света и тьмы, в которой человеческая душа проходит через испытания судьбой.";
        Random random = new Random();

        ArrayList<Actor> actors = createActors();
        ArrayList<Director> directors = createDirectors();
        Person musicalAuthor = new Person("Настасья", "Хрущева", Gender.FEMALE);
        Person choreographer = new Person("Алина", "Акимова", Gender.FEMALE);

        Show classicShow = new Show("Мастер и Маргарита", 1.35, directors.get(0), new ArrayList<>());
        Opera opera = new Opera("Ромео и Джульетта", 2.10, directors.get(1), actors, musicalAuthor, OPERA_LIBRETTO_TEXT, 10);
        Ballet ballet = new Ballet(
                "Щелкунчик",
                1.40,
                directors.get(1),
                new ArrayList<>(actors.subList(1, 3)),
                musicalAuthor,
                BALLET_LIBRETTO_TEXT,
                choreographer
        );

        fillShowWithActors(random, classicShow, actors, 3);
        fillShowWithActors(random, opera, actors, 2);
        fillShowWithActors(random, ballet, actors, 3);

        classicShow.printListOfActors();
        opera.printListOfActors();
        ballet.printListOfActors();

        replaceRandomActor(random, classicShow, true);
        replaceRandomActor(random, opera, false);
        opera.printLibrettoText();
        ballet.printDirectorInfo();
        ballet.printLibrettoText();
    }

    private static void fillShowWithActors(
            Random random,
            Show show,
            ArrayList<Actor> actors,
            int targetSize
    ) {
        int attemptsLeft = 0;
        while (show.getListOfActors().size() < targetSize && attemptsLeft < 5) {
            show.addActor(findRandomActor(random, actors));
            attemptsLeft++;
        }
    }

    private static void replaceRandomActor(Random random, Show show, boolean randomizeNewActor) {
        String oldActorLastName;
        if (randomizeNewActor) {
             oldActorLastName = findRandomActor(random, show.getListOfActors()).getLastName();
        } else {
            oldActorLastName = "Акимова";
        }
        Actor actorToAdd = show.getListOfActors().get(1);
        show.changeActor(actorToAdd, oldActorLastName);
    }

    private static ArrayList<Actor> createActors() {
        ArrayList<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Иван", "Иванович", Gender.MALE, 183));
        actors.add(new Actor("Мария", "Успенская", Gender.FEMALE, 165));
        actors.add(new Actor("Сергей", "Безруков", Gender.MALE, 190));
        return actors;
    }

    private static ArrayList<Director> createDirectors() {
        ArrayList<Director> directors = new ArrayList<>();
        directors.add(new Director("Сергей", "Женовач", Gender.MALE, 13));
        directors.add(new Director("Филипп", "Григорьян", Gender.MALE, 11));
        return directors;
    }

    private static Actor findRandomActor(Random random, ArrayList<Actor> actors) {
        int randomIndex = random.nextInt(actors.size());
        return actors.get(randomIndex);
    }
}
