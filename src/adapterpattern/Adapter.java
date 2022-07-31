package adapterpattern;

// 步骤3：创建适配器类
public class Adapter implements Target1{
    private Adaptee adaptee;
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
