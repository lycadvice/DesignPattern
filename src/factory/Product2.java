package factory;

// 抽象产品类
public abstract class Product2 {
    public abstract void produce();
}

class Product2A extends Product2 {

    @Override
    public void produce() {
        System.out.println("产品A");
    }
}

class Product2B extends Product2 {

    @Override
    public void produce() {
        System.out.println("产品B");
    }
}