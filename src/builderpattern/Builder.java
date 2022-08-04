package builderpattern;

/**
 * 背景：小成希望去电脑城买一台组装的台式主机
 * 过程：
 * 1.电脑城老板（Diretor）和小成（Client）进行需求沟通（买来打游戏？学习？看片？）
 * 2.了解需求后，电脑城老板将小成需要的主机划分为各个部件（Builder）的建造请求（CPU、主板blabla）
 * 3.指挥装机人员（ConcreteBuilder）去构建组件；
 * 4.将组件组装起来成小成需要的电脑（Product）
 */
// 步骤1：定义组装的过程：组装电脑的过程
public abstract class Builder {
    // 第一步：装CPU
    // 声明为抽象方法，具体由子类实现
    public abstract void buildCPU();

    // 第二步：装主板
    public abstract void buildMainBoard();

    // 第三步：装硬盘
    public abstract void buildHD();

    // 返回产品的方法，获得组装好的电脑
    public abstract Computer getComputer();
}
