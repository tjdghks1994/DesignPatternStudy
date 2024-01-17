package chain_of_responsibility;

/**
 * 문제 해결 사슬을 만들기 위한 추상 클래스
 * next 필드는 떠넘길 곳
 * setNext 메소드로 떠넘길 곳을 설정
 * resolve 메소드는 하위 클래스에서 구현하는 것을 가정한 추상 메서드
 * - 반환 값이 true 이면 트러블이 해결되었음을 나타내고, false 이면 트러블이 해결되지 않았음을 나타낸다
 * support 메소드는 resolve 메소드를 호출한 후 반환값이 false 이면 트러블 처리를 떠넘긴다
 * - 처리를 떠 넘길 곳이 더이상 없는 경우, 자신이 사슬의 마지막이고 아무도 해결하지 못했으므로 해당 사실을 표시한다
 */
public abstract class Support {
    private String name;    // 트러블 해결자 이름
    private Support next;   // 떠넘길 곳

    public Support(String name) {
        this.name = name;
        this.next = null;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    @Override
    public String toString() {
        return "Support{" +
                "name='" + name + '\'' +
                '}';
    }

    protected abstract boolean resolve(Trouble trouble);

    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }
}
