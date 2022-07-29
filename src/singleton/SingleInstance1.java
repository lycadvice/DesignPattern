package singleton;

public class SingleInstance1 {
    /**
     * 饿汉式
     *
     * 依赖JVM类加载机制，保证单例只会被创建一次，即线程安全
     * JVM在类的初始化阶段（即在Class被加载后、被线程使用前），会执行类的初始化
     * 在执行类的初始化阶段、JVM会去获取一个锁。这个锁可以同步多个线程对同一个类的初始化
     *
     * 饿汉式不会有线程安全的问题，因为jvm只加载一次单例
     */

    // 1.加载该类时，单例就会被自动创建
    private SingleInstance1 singleInstance1 = new SingleInstance1();

    // 2.构造函数，设置为private，禁止其他地方创建实例
    private SingleInstance1() {

    }

    // 3.通过调用静态方法获得创建的单例
    public SingleInstance1 getSingleInstance1() {
        return singleInstance1;
    }

}
