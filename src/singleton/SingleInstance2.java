package singleton;

public enum SingleInstance2 {
    /**
     * 枚举类型
     *
     * 特点：
     * 1.枚举类型为不可继承的类
     *
     * 2.每个枚举元素都是一个静态常量
     *      依赖jvm类加载机制，保证实例只被创建一次，保证线程安全
     * 3.构造方法的访问权限默认为private
     *      防止其他地方调用构造函数
     * 4.每个枚举类型及其定义的枚举变量在jvm中都是唯一的
     *      保证枚举元素的不可变性，即不能通过克隆、序列化 & 反序列化来复制枚举
     */

    // TODO 克隆、序列化 & 反序列化

    // 1.定义一个枚举的元素
    SINGLE_INSTANCE_2;

    // 隐藏了一个空的私有的构造方法
    // private SingleInstance2 getInstance2() {}
}

class CSingleInstance2{
    SingleInstance2 singleInstance2 = SingleInstance2.SINGLE_INSTANCE_2;
}
