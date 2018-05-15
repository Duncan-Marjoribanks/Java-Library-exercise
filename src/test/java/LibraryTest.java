import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library();
        book = new Book();
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(6, library.stockCount());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book);
        library.removeBook();
        assertEquals(0, library.stockCount());
    }

    @Test
    public void isStockFull(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(true, library.reachedCapacity());
    }
}
