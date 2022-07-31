package abstractfactory;

/**
 * 抽象工厂模式
 * 步骤1：创建抽象工厂类，定义具体工厂的公共接口
 *
 * 优点：将具体产品的创建延迟到具体工厂的子类中，将对象的创建封装起来，可以减少客户端与具体产品类直接的依赖
 * 新增一种产品类时，只需要增加响应的具体产品类，抽象产品类和相应的工厂子类即可
 */
public abstract class Factory3 {
    public abstract AbstractProduct generateA();
    public abstract AbstractProduct generateB();
}
