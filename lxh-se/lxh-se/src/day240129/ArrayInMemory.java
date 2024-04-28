package day240129;

/**
 * memory.png
 *
 * 栈
 *   用于存储正在执行的每个方法的局部变量表等
 *     局部变量表存放了编译期可知长度的各种基本数据类型、对象引用；方法执行完，会被自动释放。
 *   FILO、LIFO
 * 堆
 *   存储对象（包括数组对象），new来创建的，都存储在堆内存
 *
 * 方法区
 *   存储已被虚拟机加载的类信息、常量、（静态变量）、即时编译器编译后的代码等数据
 *
 * 本地方法栈
 *   当程序中调用了native的本地方法时，本地方法执行期间的内存区域
 * 程序计数器
 *   程序计数器是CPU中的寄存器，它包含每一个线程下一条要执行的指令的地址
 */
public class ArrayInMemory {
    public static void main(String[] args) {
        int[] ages = new int[4];
        ages[0] = 20;
        ages[2] = 18;

        String[] names = new String[2];
        names[1] = "小六";
        names = new String[3];
    }
}