package prototype;

public abstract class ProductClass implements Cloneable {

    public abstract void use(String s);

    // 인스턴스 복제
    public ProductClass createCopy(ProductClass product) {
        ProductClass p = null;
        try {
            p = (ProductClass) product.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        return p;
    }

}
