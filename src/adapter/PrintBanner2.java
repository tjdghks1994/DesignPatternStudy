package adapter;

public class PrintBanner2 extends Print2 {
    private Banner banner;

    public PrintBanner2(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen(); // 위임 - 자신이 처리하지 않고, 다른 인스턴스에게 맡기는 것
    }

    @Override
    public void printStrong() {
        banner.showWithAster(); // 위임 - 자신이 처리하지 않고, 다른 인스턴스에게 처리를 맡기는 것
    }
}
