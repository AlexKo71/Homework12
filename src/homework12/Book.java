package homework12;

public class Book {
    private final String name;
    private final Author surname;
    private int yearPublishing;

    public Book(String name, Author surname, int yearPublishing) {
        this.name = name;
        this.surname = surname;
        this.yearPublishing = yearPublishing;
    }

    public String getName() {
        return this.name;
    }

    public Author getSurname() {
        return this.surname;
    }

    public int getYearPublishing() {
        return this.yearPublishing;
    }
    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
}
