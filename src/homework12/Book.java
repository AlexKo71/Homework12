package homework12;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublishing == book.yearPublishing && name.equals(book.name) && surname.equals(book.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, yearPublishing);
    }
}
