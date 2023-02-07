import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> shelf;

    public Borrower(){
        this.shelf = new ArrayList<>();
    }


    public int bookCount() {
        return this.shelf.size();
    }

    public void addBook(Book book1) {
        this.shelf.add(book1);
    }
}
