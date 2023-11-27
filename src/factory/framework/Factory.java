package factory.framework;

public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);

        return p;
    }
    // 제품을 생성 (인스턴스 생성)
    protected abstract Product createProduct(String owner);
    // 제품을 등록
    protected abstract void registerProduct(Product product);
}
