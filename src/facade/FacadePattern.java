package facade;

/**
 * 背景：小成的爷爷已经80岁了，一个人在家生活：每次都需要打开灯、打开电视、打开空调；睡觉时关闭灯、关闭电视、关闭空调；
 * 冲突：行动不方便，走过去关闭那么多电器很麻烦，代码如下：
 */
public class FacadePattern {
    /**
     * 如下可看出，在不使用外观模式的情况下，需要对每个电器进行操作，非常不方便
     * 客户端与三个子系统都发送了耦合，使得客户端程序依赖与子系统
     *
     * public static void main(String[] args) {
     *         SubSystemALight light = new SubSystemALight();
     *         SubSystemBTelevision television = new SubSystemBTelevision();
     *         SubSystemCAirCondition airCondition = new SubSystemCAirCondition();
     *
     *         // 起床后开电器
     *         System.out.println("起床了");
     *         light.on();
     *         television.on();
     *         airCondition.on();
     *
     *         System.out.println("可以看电视了");
     *
     *         // 睡觉时关电器
     *         System.out.println("睡觉了");
     *         light.off();
     *         television.off();
     *         airCondition.off();
     *         System.out.println("可以睡觉了");
     *     }
     */

    public static void main(String[] args) {
        // 实例化电器类
        SubSystemALight light = new SubSystemALight();
        SubSystemBTelevision television = new SubSystemBTelevision();
        SubSystemCAirCondition airCondition = new SubSystemCAirCondition();

        Facade facade = new Facade(light, television, airCondition);

        // 客户端直接与外观对象进行交互
        facade.on();
        System.out.println("可以看电视了");
        facade.off();
        System.out.println("可以睡觉了");
    }
}
