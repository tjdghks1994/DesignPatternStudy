package chain_of_responsibility;

/**
 * 발생한 트러블을 표현하는 클래스
 * number 는 트러블 번호
 * getNumber 메소드로 트러블 번호를 얻는다
 */
public class Trouble {
    private int number;

    public Trouble(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Trouble{" +
                "number=" + number +
                '}';
    }
}
