package adapterpattern;

// 步骤3：创建适配器类
public class Adapter220V extends PowerPort220V implements Target{
    /**
     * 实际上convert_110V只是调用了原有插头的Output_220V的内容
     * 所以适配器只是将Output_220V做了一层封装，封装成Target可以调用的convert_110V而已
     */
    @Override
    public void convert_110V() {
        this.Output_220V();
    }
}
