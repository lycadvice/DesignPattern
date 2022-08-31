package observer;

public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subject = new SubscriptionSubject();

        // 创建微信用户
        WeixinUser user1 = new WeixinUser("user1");
        WeixinUser user2 = new WeixinUser("user2");
        WeixinUser user3 = new WeixinUser("user3");

        // 订阅公众号
        subject.attach(user1);
        subject.attach(user2);
        subject.attach(user3);

        // 公众号更新发出消息给订阅的微信用户
        subject.notify("message updated");
    }
}
