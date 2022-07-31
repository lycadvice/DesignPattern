package adapterpattern;

public class AdapterPatternImpl1 {
    public static void main(String[] args) {
        Target1 mAdapter = new Adapter(new Adaptee());
        mAdapter.request();
    }
}
