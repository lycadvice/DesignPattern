package facade;

class SubSystemALight {
    public void on() {
        System.out.println("打开了灯");
    }

    public void off() {
        System.out.println("关闭了灯");
    }
}

class SubSystemBTelevision {
    public void on() {
        System.out.println("打开了电视");
    }

    public void off() {
        System.out.println("关闭了电视");
    }
}

class SubSystemCAirCondition {
    public void on() {
        System.out.println("打开了空调");
    }

    public void off() {
        System.out.println("关闭了空调");
    }
}
