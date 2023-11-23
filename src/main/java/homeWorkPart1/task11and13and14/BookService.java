package homeWorkPart1.task11and13and14;

import java.util.*;
import java.util.stream.Collectors;

public class BookService {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> listOfBooks() {
        return new ArrayList<>(books);
    }

    public List<Book> getBooksByGenre(Genre genre) {
        return books.stream().filter(book -> book.getGenre() == genre).collect(Collectors.toList());
    }

    public List<Book> getBooksReleasedBefore(int year) {
        return books.stream().filter(book -> book.getYearOfRelease() < year).collect(Collectors.toList());
    }

    public Book getMostExpensiveBook() {
        return Collections.max(books, Comparator.comparingDouble(Book::getPrice));
    }

    public Book getCheapestBook() {
        return Collections.min(books, Comparator.comparingDouble(Book::getPrice));
    }

    public List<Book> getBooksByAuthorCount(int authorCount) {
        return books.stream().filter(book -> book.getAuthors().size() == authorCount).collect(Collectors.toList());
    }

    public List<Book> getBooksSortedByPrice(boolean ascending) {
        Comparator<Book> comparator = Comparator.comparingDouble(Book::getPrice);
        if (!ascending) {
            comparator = comparator.reversed();
        }
        return books.stream().sorted(comparator).collect(Collectors.toList());
    }

    public boolean containsBook(Book book) {
        return books.contains(book);
    }

    public List<Book> getBooksByAuthor(Author author) {
        return books.stream().filter(book -> book.getAuthors().contains(author)).collect(Collectors.toList());
    }

    public Map<Genre, String> getUniqueGenreTitlePairs() {
        Map<Genre, String> genreTitleMap = new HashMap<>();

        for (Book book : books) {
            Genre genre = book.getGenre();
            String title = book.getTitle();

            genreTitleMap.merge(genre, title, (existingTitles, newTitle) -> existingTitles + ", " + newTitle);
        }

        return genreTitleMap;
    }

    public Stack<Book> getBooksSortedByPriceDescending() {

        List<Book> copyOfBooks = new ArrayList<>(List.copyOf(books));

        copyOfBooks.sort(Collections.reverseOrder(new BookPriceComparator()));

        Stack<Book> bookStack = new Stack<>();
        bookStack.addAll(copyOfBooks);

        return bookStack;
    }

}
