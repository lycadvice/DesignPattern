package singleton;

public class SingleInstance6 {
    /**
     * 静态内部类
     * 在静态内部类里创建单例，在创建内部类的时候才会去创建单例
     * 可解决按需加载，线程安全的问题
     */

    /**
     * 调用过程：
     * 外部调用getInstance()
     * 自动调用SingleInstance7.singleInstance6
     * 此时单例类SingleInstance7初始化
     * SingleInstance7在装载 & 被初始化时，会初始化它的静态域，从而创建单例
     * 由于是静态域，jvm只会加载一次，保证了线程安全
     */

    // 1.静态内部类
    private static class SingleInstance7 {
        private static SingleInstance6 singleInstance6 = new SingleInstance6();
    }

    // 2.构造函数权限为private
    private SingleInstance6() {}

    // 3.getInstance
    public static SingleInstance6 getInstance() {
        return SingleInstance7.singleInstance6;
    }
}
