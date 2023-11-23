package homeWorkPart1.task11and13and14;

import java.util.List;
import java.util.Objects;

public class Book {
    private String title;
    private double price;
    private int yearOfRelease;
    private List<Author> authors;
    private Genre genre;

    public Book(String title, double price, int yearOfRelease, List<Author> authors, Genre genre) {
        this.title = title;
        this.price = price;
        this.yearOfRelease = yearOfRelease;
        this.authors = authors;
        this.genre = genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, yearOfRelease, authors, genre);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Book book = (Book) obj;
        return Double.compare(book.price, price) == 0 &&
                yearOfRelease == book.yearOfRelease &&
                Objects.equals(title, book.title) &&
                Objects.equals(authors, book.authors) &&
                genre == book.genre;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public Genre getGenre() {
        return genre;
    }
}
