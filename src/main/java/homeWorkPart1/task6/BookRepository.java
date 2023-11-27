package homeWorkPart1.task6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookRepository {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(int id) {
        books.removeIf(book -> book.getId() == id);
    }

    //Removing book using foreach (enhanced for) loop
    public void removeBookV2(int id) {
        List<Book> booksToRemove = new ArrayList<>();

        for (Book book : books) {
            if (book.getId() == id) {
                booksToRemove.add(book);
            }
        }
        books.removeAll(booksToRemove);
    }

    public Book findBookById(int id) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        throw new NoBookFoundException("No book found with ID " + id);
    }

    public List<Book> findBooksByTitle(String title) throws NoBookFoundException {

        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                foundBooks.add(book);
            }
        }
        if (foundBooks.isEmpty()) {
            throw new NoBookFoundException("No books found with the title: " + title);
        }
        return foundBooks;
    }

}
