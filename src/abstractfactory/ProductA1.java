package abstractfactory;

/**
 * 步骤4：创建具体产品类，定义生产的具体产品
 */
public class ProductA1 extends AbstractProductA{
    @Override
    public void produce() {
        System.out.println("A产品");
    }
}

/**
 * 步骤4：创建具体产品类，定义生产的具体产品
 */
class ProductA2 extends AbstractProductB {
    @Override
    public void produce() {
        System.out.println("B产品");
    }
}
