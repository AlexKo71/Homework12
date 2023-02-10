package homework12;

public class Author {
    private final String firstName;
    private final String lastName;

    public Author(String firstname, String lastname) {
        this.firstName = firstname;
        this.lastName = lastname;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }

}
