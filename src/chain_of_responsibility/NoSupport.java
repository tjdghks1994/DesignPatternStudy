package chain_of_responsibility;

/**
 * Support 클래스의 하위 클래스
 * resolve 메소드는 항상 false 를 반환
 * 즉, 자신은 어떤 문제도 해결하지 않는 클래스이다
 */
public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
