package iterator;

import java.util.Iterator;

public class BookMain {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        // 배열을 사용하던 것을 ArraysList를 사용하도록 변경하여 초기 size를 초과해도 문제 없음
        bookShelf.appendBook(new Book("Design-Patterns"));

        // 명시적으로 Iterator를 사용하는 방법
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

        // 확장 for문을 사용하는 방법
        for (Book book : bookShelf) {
            System.out.println(book.getName());
        }
        System.out.println();
    }
}
