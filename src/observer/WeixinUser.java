package observer;

// 具体观察者（ConcreteObserver）
// 微信用户是观察者，实现更新的方法
public class WeixinUser implements Observer{
    // 微信用户名
    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}
