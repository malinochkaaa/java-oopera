package person;

import java.util.Objects;

public class Actor extends Person {
    private int height;

    public Actor(String firstName, String lastName, Gender gender, int height) {
        super(firstName, lastName, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Actor actor = (Actor) o;
        return getHeight() == actor.getHeight() &&
                Objects.equals(getFirstName(), actor.getFirstName()) &&
                Objects.equals(getLastName(), actor.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getHeight());
    }
}