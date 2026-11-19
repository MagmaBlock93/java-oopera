import java.util.Objects;

public class Person {
    protected String name;
    protected String surname;
    protected Gender gender;
    protected int height;

    public Person(String name, String surname, Gender gender, int height) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return height == person.height && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender, height);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    public int getHeight() {
        return height;
    }
}
