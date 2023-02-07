import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;

    @Before
    public void before(){
        book = new Book("The Use of Weapons", "Ian M. Banks", "Sci-Fi");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("The Use of Weapons", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Ian M. Banks", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Sci-Fi", book.getGenre());
    }
}
