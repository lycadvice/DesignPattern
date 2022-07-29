package singleton;

public class SingleInstance3 {
    /**
     * 懒汉式
     * 单例创建时机可控，有需要时，才手动创建单例
     *
     * 缺点：线程安全问题
     * 导致线程不安全的原因：
     * 可能存在多个线程并发调用getInstance()，导致重复创建了单例对象
     * 例如：线程A 执行到singleInstance3 = new SingleInstance3()，但是对象初始化需要时间，此时对象并未创建成功
     * 线程B 在执行时，执行到了if (singleInstance3 == null)，这时会判断通过，故线程B也会执行singleInstance3 = new SingleInstance3()
     * 最终线程A 和线程B 同时获得了一个单例对象，内存中存在两个SingleInstance3的单例
     */

    // 1.类加载时先不创建单例
    private static SingleInstance3 singleInstance3 = null;

    // 2.构造函数权限为private
    private SingleInstance3() {}

    // 3.需要时才调用此方法创建单例
    public static SingleInstance3 getInstance() {
        // 先判断单例是否为空，避免重复创建
        if (singleInstance3 == null) {
            singleInstance3 = new SingleInstance3();
        }
        return singleInstance3;
    }
}
