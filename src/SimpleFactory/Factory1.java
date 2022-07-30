package SimpleFactory;

/**
 * 工厂类
 */
public class Factory1 {
    private static final String PRODUCT_A = "productA";
    private static final String PRODUCT_B = "productB";
    private static final String PRODUCT_C = "productC";

    public static Product1 generate(String product) {
    // 通过switch控制生产的Product。外界只需调用工厂的静态方法传入参数即可
        switch (product) {
            case PRODUCT_A:
                return new ProductA();
            case PRODUCT_B:
                return new ProductB();
            case PRODUCT_C:
                return new ProductC();
            default:
                return null;
        }
    }
}
