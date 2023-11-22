package template;

public class StringDisplayImpl implements AbstractDisplayIF {
    private String s;
    private int width;

    public StringDisplayImpl(String s) {
        this.s = s;
        this.width = s.length();
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + s + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
