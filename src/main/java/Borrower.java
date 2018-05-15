import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList <Book> collection;

    public Borrower(String name) {
        this.name = name;
        this.collection = new ArrayList <>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int collectionCount(){
        return this.collection.size();
    }

    public void collect(Book book){
        this.collection.add(book);
    }

    public void borrowBookFromLibrary(Library library){
        Book book = library.removeBook();
        library.removeBook();
        this.collect(book);
    }


}
