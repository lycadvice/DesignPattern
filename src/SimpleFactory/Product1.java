package SimpleFactory;

/**
 * 简单工厂模式
 * 1.创建抽象产品类，定义具体产品的公共接口
 * 2.创建具体产品类，继承抽象产品类，实现抽象产品类的公共接口
 * 3.创建工厂类，通过调用静态方法传入不同的参数创建不同的具体产品类的实例
 */


/**
 * 抽象产品类
 */
public abstract class Product1 {
    // 接口
    public abstract void produce();
}

// 具体产品类ProductA
class ProductA extends Product1 {

    @Override
    public void produce() {
        System.out.println("产品A");
    }
}

// 具体产品类ProductB
class ProductB extends Product1 {

    @Override
    public void produce() {
        System.out.println("产品B");
    }
}

// 具体产品类ProductC
class ProductC extends Product1 {

    @Override
    public void produce() {
        System.out.println("产品C");
    }
}