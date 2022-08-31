package observer;

// 抽象被观察者
// 抽象主题，提供了attach,detach,notify三个方法
public interface Subject {
    /**
     * 增加订阅者
     * @param observer
     */
    void attach(Observer observer);

    /**
     * 删除订阅者
     * @param observer
     */
    void detach(Observer observer);

    /**
     * 通知订阅的观察者更新消息
     * @param message
     */
    void notify(String message);
}
