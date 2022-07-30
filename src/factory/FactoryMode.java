package factory;

public class FactoryMode {
    public static void main(String[] args) {
        Factory2A factory2A = new Factory2A();
        factory2A.generate().produce();

        Factory2B factory2B = new Factory2B();
        factory2B.generate().produce();
    }
}
