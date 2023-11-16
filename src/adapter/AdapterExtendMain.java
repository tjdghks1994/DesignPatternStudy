package adapter;

// 상속을 사용한 어댑터 패턴
public class AdapterExtendMain {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
