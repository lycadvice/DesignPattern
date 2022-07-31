package adapterpattern;

// 步骤4：定义具体使用目标类，并通过Adapter类调用所需要的方法实现目标
public class AdapterPatternImpl {
    public static void main(String[] args) {
        Target mAdapter220V = new Adapter220V();
        ImportedMachine importedMachine = new ImportedMachine();

        // 用户拿着进口机器插上适配器（调用convert_110V方法）
        // 再将适配器插上原有插头，（convert_110V方法内部调用Output_220V方法输出220V）
        // 适配器只是个外壳，对外提供110V，本质还是220V供电
        mAdapter220V.convert_110V();
        importedMachine.work();
    }
}

class ImportedMachine {
    public void work() {
        System.out.println("进口机器正常运行");
    }
}