package task16;

import java.util.Comparator;
import task12.Book;
public class NameComparator implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {return o1.getTitle().compareToIgnoreCase(o2.getTitle());}
}
