import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList <Book> onLoan;

    public Borrower(String name) {
        this.name = name;
        this.onLoan = new ArrayList <>();
    }

    public int collectionCount(){
        return this.onLoan.size();
    }

    public void collect(Book book){
        this.onLoan.add(book);
    }

}

