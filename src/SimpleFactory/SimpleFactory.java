package SimpleFactory;

/**
 * 简单工厂生产产品
 */
public class SimpleFactory {
    public static void main(String[] args) {
        Factory1 factory1 = new Factory1();
        try {
            factory1.generate("productA").produce();
        } catch (NullPointerException e) {
            System.out.println("未知product");
        }

        try {
            factory1.generate("productB").produce();
        } catch (NullPointerException e) {
            System.out.println("未知product");
        }

        try {
            factory1.generate("productB").produce();
        } catch (NullPointerException e) {
            System.out.println("未知product");
        }

        try {
            factory1.generate("null").produce();
        } catch (NullPointerException e) {
            System.out.println("未知product");
        }

    }
}
