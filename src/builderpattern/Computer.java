package builderpattern;

import java.util.ArrayList;
import java.util.List;

// 步骤4：定义具体产品类：电脑
public class Computer {
    private List<String> parts = new ArrayList<String>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        for (int i = 0; i < parts.size(); i++) {
            System.out.println("组件" + parts.get(i) + "组装好了");
        }
        System.out.println("电脑组装完成请验收");

    }
}
