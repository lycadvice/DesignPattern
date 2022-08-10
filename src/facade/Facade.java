package facade;

/**
 * 类似于智能家居控制器（外观对象/统一接口），可以一键打开/关闭灯、电视机、空调
 * 即用外观模式来为所有子系统设计一个统一的接口
 * 客户端只需要调用外观类中的方法就可以了，简化了客户端的操作
 */
public class Facade {
    SubSystemALight light;
    SubSystemBTelevision television;
    SubSystemCAirCondition airCondition;

    public Facade(SubSystemALight light, SubSystemBTelevision television, SubSystemCAirCondition airCondition) {
        this.light = light;
        this.television = television;
        this.airCondition = airCondition;
    }

    // 起床后一键开电器
    public void on() {
        System.out.println("起床了");
        light.on();
        television.on();
        airCondition.on();
    }

    // 睡觉时一键关电器
    public void off() {
        System.out.println("睡觉了");
        light.off();
        television.off();
        airCondition.off();
    }
}
