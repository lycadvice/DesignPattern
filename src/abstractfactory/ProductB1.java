package abstractfactory;

/**
 * 步骤4：创建具体产品类，定义生产的具体产品
 */
public class ProductB1 extends AbstractProductB {
    @Override
    public void produce() {
        System.out.println("B产品");
    }
}

/**
 * 步骤4：创建具体产品类，定义生产的具体产品
 */
class ProductB2 extends AbstractProductA {

    @Override
    public void produce() {
        System.out.println("A产品");
    }
}
