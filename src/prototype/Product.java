package prototype;

public interface Product extends Cloneable {
    public abstract void use(String s);
    // 인스턴스 복제
    public abstract Product createCopy();
}
