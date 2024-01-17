package chain_of_responsibility;

/**
 * 지정한 번호의 문제에 한해 해결하는 클래스
 */
public class SpecialSupport extends Support {
    private int number;

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }
    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() == number) {
            return true;
        }

        return false;
    }
}
