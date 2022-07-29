package singleton;

public class SingleInstance5 {
    /**
     * 双重校验锁
     * 在同步锁的基础上，添加一次if判断，当单例创建后不用再访问同步锁即可获取单例
     */

    // 1.类加载时，不创建单例，volatile防止指令重排
    private static volatile SingleInstance5 singleInstance5 = null;

    // 2.构造函数权限为private
    private SingleInstance5() {}

    /**
     * 第一个if：若单例不为null，则直接返回已创建的单例
     * 第二个if：防止多次创建
     *
     * 线程A调用getInstance()，在第一次判空时，线程B同时调用getInstance()
     * 此时A并未调用new SingleInstance5()，单例并未创建，故线程B可以通过第一个if判断
     * 执行到同步锁等待A线程释放锁，A释放锁后，单例已创建，线程B不能通过第二个if判断
     * 此时线程B直接获取到的是线程A创建的单例
     */
    // 3.double check
    public static SingleInstance5 getInstance() {
        if (singleInstance5 == null) {
            synchronized (SingleInstance5.class) {
                if (singleInstance5 == null) {
                    singleInstance5 = new SingleInstance5();
                }
            }
        }
        return singleInstance5;
    }
}
