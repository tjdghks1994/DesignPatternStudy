package factory.idcard;

import factory.framework.Product;

public class IdCard extends Product {

    private String owner;
    private int serialNumber;

    IdCard(String owner, int serialNumber) {
        System.out.println(owner+"의 카드를 " + serialNumber + "번으로 만듭니다.");
        this.owner = owner;
        this.serialNumber = serialNumber;
    }

    @Override
    public void use() {
        System.out.println(this+"을 사용합니다.");
    }

    @Override
    public String toString() {
        return "IdCard{" +
                "owner='" + owner + '\'' +
                ", serialNumber=" + serialNumber +
                '}';
    }

    public String getOwner() {
        return owner;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}
