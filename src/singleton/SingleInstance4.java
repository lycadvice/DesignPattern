package singleton;

public class SingleInstance4 {
    /**
     * 同步锁，懒汉式的改进
     * 使用同步锁synchronized锁住创建单例的方法，防止多个线程同时调用，导致线程安全问题
     *
     * 缺点：当getInstance是第一次调用且被两个线程同时调用时，一个线程需要等待释放锁，每次调用需要访问同步锁
     */

    // 1.类加载时，不创建单例
    private static SingleInstance4 singleInstance4 = null;

    // 2.构造函数权限为private，防止其他地方调用
    private SingleInstance4() {}

    // 3.getInstance，加入同步锁
    public static SingleInstance4 getInstance() {
        synchronized (SingleInstance4.class) {
            if (singleInstance4 == null) {
                singleInstance4 = new SingleInstance4();
            }
        }
        return singleInstance4;
    }
}
