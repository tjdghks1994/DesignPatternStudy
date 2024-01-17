package chain_of_responsibility;

/**
 * limit 으로 지정한 번호 미만의 문제를 해결하는 클래스
 * resolve 메소드에서는 limit 으로 지정된 번호 미만의 문제를 해결 후 true 반환
 */
public class LimitSupport extends Support {
    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }
    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < limit) {
            return true;    // limit 으로 지정된 번호 미만이므로 문제 해결
        }

        return false;
    }
}
