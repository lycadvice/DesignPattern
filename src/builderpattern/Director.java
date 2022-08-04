package builderpattern;

// 步骤2：电脑城老板委派任务给装机人员
public class Director {
    // 指挥装机人员组装电脑
    public void construct(Builder builder) {
        builder.buildCPU();
        builder.buildMainBoard();
        builder.buildHD();
    }

    public Computer getComputer(Builder builder) {
        return builder.getComputer();
    }
}
