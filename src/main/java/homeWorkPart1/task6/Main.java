package homeWorkPart1.task6;

import java.util.List;

public class Main {

    public static void main(String[] args) throws NoBookFoundException {

        Book book1 = new Book(1, "The Master and Margarita", "Mikhail Bulgakov", 1966);
        Book book2 = new Book(2, "One Hundred Years of Solitude", "Gabriel García Márquez", 1967);
        Book book3 = new Book(3, "Pride and Prejudice", "Jane Austen", 1813);
        Book book4 = new Book(4, "To Kill a Mockingbird", "Harper Lee", 1960);
        Book book5 = new Book(5, "jfr", "jhf doi", 1400);

        BookRepository myBookRepository = new BookRepository();
        myBookRepository.addBook(book1);
        myBookRepository.addBook(book2);
        myBookRepository.addBook(book3);
        myBookRepository.addBook(book4);
        myBookRepository.addBook(book5);

        try {
            Book book = myBookRepository.findBookById(1);
            System.out.println("Found Book by ID: " + book);
        } catch (NoBookFoundException e) {
            System.err.println(e.getMessage());
        }

        try {
            List<Book> books = myBookRepository.findBooksByTitle("Pride and Prejudice");
            for (Book book : books) {
                System.out.println("Found Book by Title: " + book);
            }
        } catch (NoBookFoundException e) {
            System.err.println(e.getMessage());
        }


        myBookRepository.removeBook(5);

        try {
            Book book = myBookRepository.findBookById(5);
            System.out.println("Found Book by ID: " + book);
        } catch (NoBookFoundException e) {
            System.err.println(e.getMessage());
        }

    }
}
