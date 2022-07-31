package abstractfactory;

/**
 * 步骤5：创建具体工厂类，定义创建对应具体产品实例的方法
 */
public class FactoryA extends Factory3 {
    @Override
    public AbstractProduct generateA() {
        return new ProductA1();
    }

    @Override
    public AbstractProduct generateB() {
        return new ProductB2();
    }
}

class FactoryB extends Factory3 {
    @Override
    public AbstractProduct generateA() {
        return new ProductA2();
    }

    @Override
    public AbstractProduct generateB() {
        return new ProductB1();
    }
}
