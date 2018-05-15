import java.util.ArrayList;

public class Library {
    private ArrayList<Book> stock;

    public Library(){
        this.stock = new ArrayList <>();
    }

    public void addBook(Book book){
        this.stock.add(book);
    }


    public int stockCount() {
        return stock.size();
    }
}
