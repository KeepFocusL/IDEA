package day240602;


import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"all"})
public class SetDemo2 {
    public static void main(String[] args) {
        // 问题：Set 是如何判断即将加入的元素跟之前的重复了？
        Set<CustomObj> customObjs = new HashSet<>();

        customObjs.add(new CustomObj("X", 1));
        customObjs.add(new CustomObj("Y", 2));
        customObjs.add(new CustomObj("Z", 3));

        customObjs.add(new CustomObj("Y", 2));

        System.out.println(customObjs.size());
        System.out.println(customObjs);

        // 如何让 customObjs.size() = 3
        // 思考：重写 CustomObj equals 方法

        System.out.println("=== === ===");


        Set<CustomObj> customObjs2 = new HashSet<>();
        customObjs2.add(new CustomObj("X", 1));
        customObjs2.add(new CustomObj("Y", 2));
        customObjs2.add(new CustomObj("Z", 3));

        System.out.println(customObjs2.contains(new CustomObj("Y", 2)));
    }
}

class CustomObj {
    String name;
    int value;

    public CustomObj(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "CustomObj{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        CustomObj otherObj = (CustomObj) obj;
        return this.value == otherObj.value && this.name.equals(otherObj.name);
    }
}