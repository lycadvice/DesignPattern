package builderpattern;

// 步骤5：客户端调用，小成到电脑城买电脑
public class Client {
    public static void main(String[] args) {
        //逛了很久终于发现一家合适的电脑店
        //找到该店的老板和装机人员
        Director director = new Director();
        Builder builder = new ConcreteBuilder();

        //沟通需求后，老板叫装机人员去装电脑
        director.construct(builder);

        //装完后，老板搬来组装好的电脑
        Computer computer = director.getComputer(builder);
        //展示电脑给小成看
        computer.show();
    }
}
