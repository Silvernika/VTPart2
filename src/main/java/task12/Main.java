package task12;

import task16.AuthorComparator;
import task16.NameComparator;
import task16.PriceComparator;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static TreeSet<Book> books;
    public static void main(String[] args) {
        books = new TreeSet<>();
        books.add(new Book("Book1", "Mother", 45, 2));
        books.add(new Book("Paper1", "Brother", 88, 1));
        books.add(new Book("Magazine1", "Sister", 30, 4));
        books.add(new Book("Advert1", "Father", 65, 10));

        for(Book book:books)
            System.out.println(book.toString());

        ArrayList<Comparator<Book>> comparators = new ArrayList<Comparator<Book>>();
        comparators.add(new NameComparator());
        comparators.add((new NameComparator()).thenComparing(new AuthorComparator()));
        comparators.add((new AuthorComparator()).thenComparing(new NameComparator()));
        comparators.add(((new AuthorComparator()).thenComparing(new NameComparator())).thenComparing(new PriceComparator()));
        ArrayList<Book> books2 = new ArrayList<>();
        books2.addAll(books);
        for (Comparator<Book> comparator: comparators) {
            books2.sort(comparator);
            System.out.println("\nSorted array of books: ");
            for (Book book: books2) {
                System.out.println(book.toString());
            }
        }

    }
}
