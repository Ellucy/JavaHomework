package homeWorkPart1.task11and13and14;

import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return Double.compare(book1.getPrice(), book2.getPrice());
    }
}