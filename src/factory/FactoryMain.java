package factory;

import factory.framework.Factory;
import factory.framework.Product;
import factory.idcard.IdCardFactory;

public class FactoryMain {
    public static void main(String[] args) {
        Factory factory = new IdCardFactory();
        Product p1 = factory.create("Youngjin Kim");
        Product p2 = factory.create("Heungmin Son");
        Product p3 = factory.create("Kane");
        p1.use();
        p2.use();
        p3.use();
    }
}
