package homeWorkPart2.generics;

import java.util.List;

public class Book {

    private String title;
    private List<String> author;

    public Book(String title, List<String> author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                '}';
    }
}
