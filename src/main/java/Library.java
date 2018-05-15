import java.util.ArrayList;

public class Library {
    private ArrayList<Book> stock;
    private int capacity;

    public Library(){
        this.stock = new ArrayList <>();
        this.capacity = 6;
    }

    public void addBook(Book book){
        this.stock.add(book);
    }


    public int stockCount() {
        return stock.size();
    }

    public boolean reachedCapacity() {
        if(this.stockCount() == capacity);
        return true;
    }
}
