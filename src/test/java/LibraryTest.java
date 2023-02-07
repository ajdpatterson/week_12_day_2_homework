import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Borrower borrower;
    private Book book1;

    private Book book2;

    private Book book3;

    private Book book4;

    private Book book5;

    private Book book6;

    @Before
    public void before(){
        library = new Library();
        borrower = new Borrower();
        book1 = new Book("The Use of Weapons", "Ian M. Banks", "Sci-Fi");
        book2 = new Book("Lords and Ladies", "Terry Pratchett", "Fantasy");
        book3 = new Book("Jeeves and Wooster", "Can't Remember", "Comedy");
        book4 = new Book("Excession", "Ian M. Banks", "Sci-Fi");
        book5 = new Book("Men At Arms", "Terry Pratchett", "Fantasy");
        book6 = new Book("Red Dwarf", "Grant Naylor", "Comedy");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
    }

    @Test
    public void libraryCanHoldBooks(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void libraryCanAddBooks(){
        assertEquals(1, library.bookCount());
    }

    @Test
    public void libraryCanRemoveBook(){
        library.removeBook(book1);
        assertEquals(4, library.bookCount());
    }

    @Test
    public void libraryHasMaxStock(){
        assertEquals(5, library.bookCount());
    }


    @Test
    public void borrowerCanAddBook(){
        library.checkOutBook(book1, borrower);
        assertEquals(1, borrower.bookCount());
        assertEquals(4, library.bookCount());
    }
}
