package person;

import java.util.Objects;

public class Person {
    protected String firstName;
    protected String lastName;
    protected Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.firstName = name;
        this.lastName = surname;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public Gender getGender() {
        return gender;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender);
    }
}
