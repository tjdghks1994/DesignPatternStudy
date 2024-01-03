package decorator;

public abstract class Display {
    public abstract int getColumns();   // 가로 문자의 수를 얻는다

    public abstract int getRows();  // 가로 행 수를 얻는다

    public abstract String getRowText(int row); // row행째 문자열을 얻는다

    public void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
