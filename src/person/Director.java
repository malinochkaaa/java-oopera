package person;

public class Director extends Person {
    private int numberOfShows;

    public Director(String firstName, String lastName, Gender gender, int numberOfShows) {
        super(firstName, lastName, gender);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "Director{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", gender=" + getGender() +
                ", numberOfShows=" + numberOfShows +
                '}';
    }
}
