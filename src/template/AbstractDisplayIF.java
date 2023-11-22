package template;

public interface AbstractDisplayIF {
    void open();

    void print();

    void close();
    default void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
