package task12;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void checkClonable(){
        Book book1 = new Book("Book1", "Auth1", 45, 2);
        Object book2 = book1.clone();
        assertEquals(book1, book2);

    }

    @Test
    void checkComparator(){
        Set<Book> books = new HashSet<>();
        Main.main(null);
        books.add(new Book("Paper1", "Brother", 88, 1));
        books.add(new Book("Book1", "Mother", 45, 2));
        books.add(new Book("Magazine1", "Sister", 30, 4));
        books.add(new Book("Advert1", "Father", 65, 10));
        assertEquals(Main.books, books);
    }
}
