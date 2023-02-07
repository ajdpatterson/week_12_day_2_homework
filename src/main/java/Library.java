import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int selectedBook;
    private Borrower borrower;
    private Book checkedBook;
    public Library() {
        this.books = new ArrayList<>();
    }


    public int bookCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (this.books.size() < 5){
            this.books.add(book);
        }
    }

    public Book removeBook(Book bookToRemove) {
        selectedBook = this.books.indexOf(bookToRemove);
        return this.books.remove(selectedBook);
    }

    public void checkOutBook(Book bookToBorrow, Borrower borrower) {
        checkedBook = this.removeBook(bookToBorrow);
        borrower.addBook(checkedBook);
    }
}
