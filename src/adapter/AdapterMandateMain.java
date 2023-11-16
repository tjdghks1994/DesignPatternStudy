package adapter;

// 위임을 사용한 어댑터 패턴
public class AdapterMandateMain {
    public static void main(String[] args) {
        Print2 p = new PrintBanner2("Hello");
        p.printWeak();
        p.printStrong();
    }
}
