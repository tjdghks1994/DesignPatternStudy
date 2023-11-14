package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Iterable<Book> {
    //    private Book[] books;
    private List<Book> books;
//    private int last = 0;

//    public BookShelf(int maxSize) {
    public BookShelf(int initialSize) {
//        this.books = new Book[maxSize];
        this.books = new ArrayList<>(initialSize);
    }

    public Book getBookAt(int index) {
//        return books[index];
        return books.get(index);
    }

    public void appendBook(Book book) {
//        this.books[last] = book;
        books.add(book);
//        last++;
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
