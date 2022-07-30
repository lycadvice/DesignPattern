package simpleFactory;

/**
 * 简单工厂生产产品
 *
 * 优点：
 * 将实例化对象的工作与使用实例分开，实现了解耦
 * 代码更容易维护，符合面向对象 & 面向接口编程
 *
 * 缺点：
 * 所有实例化的产品逻辑都在工厂类中，工厂类出错，将不能实例化产品
 * 所有实例化的产品逻辑都在工厂类中，工厂逻辑过于复杂
 * 简单工厂使用了静态方法，无法被重写和继承
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
