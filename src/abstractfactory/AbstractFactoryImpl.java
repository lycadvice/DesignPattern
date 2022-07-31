package abstractfactory;

public class AbstractFactoryImpl {
    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        FactoryB factoryB = new FactoryB();

        factoryA.generateA().produce();
        factoryA.generateB().produce();

        factoryB.generateA().produce();
        factoryB.generateB().produce();
    }
}
