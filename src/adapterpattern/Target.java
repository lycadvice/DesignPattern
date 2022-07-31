package adapterpattern;

/**
 * 背景：小成买了一个进口的电视机
 * 冲突：进口电视机要求电压（110V）与国内插头标准输出电压（220V）不兼容
 * 解决方案：设置一个适配器将插头输出的220V转变成110V
 *
 * 类的适配器模式
 */
// 步骤1：创建Target接口（期待得到的插头）：能输出110V
public interface Target {
    // 将220V转换输出110V(原有插头(Adaptee)没有的)
    void convert_110V();
}
