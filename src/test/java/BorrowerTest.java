import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book;

    @Before
    public void before(){
        borrower = new Borrower("Timmy");
        library = new Library();
        book = new Book();
        library.addBook(book);
    }

    @Test
    public void canAddBook(){
        borrower.collect(book);
        assertEquals(1, borrower.collectionCount());
    }
//    @Test
//    public void canBorrowABookFromLibrary(){
//
//    }


}
