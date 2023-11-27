package factory.idcard;

import factory.framework.Factory;
import factory.framework.Product;

public class IdCardFactory extends Factory {

    private int serialNumber = 100;
    @Override
    protected synchronized Product createProduct(String owner) {
        return new IdCard(owner, serialNumber++);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
