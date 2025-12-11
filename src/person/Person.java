package person;

public class Person {
    private String firstName;
    private String lastName;
    private Gender gender;

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
}
