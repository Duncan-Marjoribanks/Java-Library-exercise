import java.util.ArrayList;

public class Library {
    private ArrayList<Book> stock;
    private int capacity;

    public Library(){
        this.stock = new ArrayList <>();
        this.capacity = 6;
    }

    public void addBook(Book book){
        if(!this.reachedCapacity())
            this.stock.add(book);
    }

    public void removeBook(Book book){
            this.stock.remove(book);
    }

    public int stockCount() {
        return stock.size();
    }

    public boolean reachedCapacity() {
        return this.stockCount() == capacity;
    }
}
