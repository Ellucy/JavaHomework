package homeWorkPart1.task11and13and14;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        BookService bookService = new BookService();

        Author danBrown = new Author("Dan", "Brown", "male");
        Author jeffreyArcher = new Author("Jeffrey", "Archer", "male");
        Author johnGrisham = new Author("John", "Grisham", "male");

        Author tolkien = new Author("J.R.R.", "Tolkien", "male");
        Author harper = new Author("Harper", "Lee", "female");
        Author george = new Author("George", "Orwell", "male");
        Author jane = new Author("Jane", "Austen", "female");
        Author mikhail = new Author("Mikhail", "Bulgakov", "male");

        Book book1 = new Book("The Hobbit", 19.99, 1937, List.of(tolkien), Genre.FANTASY);
        Book book2 = new Book("To Kill a Mockingbird", 12.99, 1960, List.of(harper), Genre.FANTASY);
        Book book3 = new Book("1984", 15.99, 1949, List.of(george), Genre.SCIFI);
        Book book4 = new Book("Pride and Prejudice", 9.99, 1813, List.of(jane), Genre.MYSTERY);
        Book book5 = new Book("The Da Vinci Code", 19.99, 2003, List.of(danBrown, jeffreyArcher, johnGrisham), Genre.MYSTERY);
        Book book6 = new Book("The Master and Margarita", 25.99, 1966, List.of(tolkien), Genre.FANTASY);

        bookService.addBook(book1);
        bookService.addBook(book2);
        bookService.addBook(book3);
        bookService.addBook(book4);
        bookService.addBook(book5);
        bookService.addBook(book6);

        Map<Genre, String> genreTitlePairs = bookService.getUniqueGenreTitlePairs();

        for (Map.Entry<Genre, String> entry : genreTitlePairs.entrySet()) {
            Genre genre = entry.getKey();
            String title = entry.getValue();

            System.out.println("Genre: " + genre + ", Titles: " + title);
        }

        String line = new String(new char[60]).replace('\0', '-');
        System.out.println(line);

        Stack<Book> sortedBooksStack = bookService.getBooksSortedByPriceDescending();

        while (!sortedBooksStack.isEmpty()) {
            Book book = sortedBooksStack.pop();
            System.out.println("Title: \"" + book.getTitle() + "\", price: " + book.getPrice() + "€");
        }

        System.out.println(line);

        List<Book> booksWithOneAuthor = bookService.getBooksByAuthorCount(1);

        for (Book book : booksWithOneAuthor) {
            System.out.println("Title: " + book.getTitle());

            for (Author author : book.getAuthors()) {
                System.out.println("Author: " + author.getName() + " " + author.getLastName());
            }

            System.out.println();
        }
    }
}
