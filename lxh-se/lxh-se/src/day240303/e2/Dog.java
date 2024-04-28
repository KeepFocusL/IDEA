package day240303.e2;

/*写一个狗Dog类
3个state：编号id、名称name、颜色color
1个behavior：show方法（调用show方法之后的输出要求见预期输出）

写一个狗Dog测试类。实例化(new)出两只狗，为其state赋值，同时调用show方法输出两只狗的详细信息

 预期输出
狗(编号**)的信息：编号=**、名称=**、颜色=**
         */
public class Dog {
    // state (field属性 variable变量)
    String id;
    String name;
    String color;

    // behavior
    public void show() {
        System.out.println("狗(编号" + id + "编号)的信息：编号=" + id + "、名称=" + name + "、颜色=" + color);
    }
}