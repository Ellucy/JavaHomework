package homeWorkPart1.task11and13and14;

import java.util.Objects;

public class Author {

    private String name;
    private String lastName;
    private String gender;

    public Author(String name, String lastName, String gender) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, gender);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Author author = (Author) obj;
        return Objects.equals(name, author.name) &&
                Objects.equals(lastName, author.lastName) &&
                Objects.equals(gender, author.gender);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }
}

