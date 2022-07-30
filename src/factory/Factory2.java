package factory;

// 抽象工厂
public abstract class Factory2 {
    public abstract Product2 generate();
}

// 具体工厂A
class Factory2A extends Factory2 {

    @Override
    public Product2 generate() {
        return new Product2A();
    }
}

// 具体工厂B
class Factory2B extends Factory2 {

    @Override
    public Product2 generate() {
        return new Product2B();
    }
}