package day240126;

/**
 * 数组介绍
 * <a href="https://docs.oracle.com/javase/tutorial/reflect/special/array.html">Arrays</a>
 *   - An array is an object of reference type which contains a fixed number of components of the same type;
 *   - the length of an array is immutable.
 *   - Creating an instance of an array requires knowledge of the length and component type.
 *   - Each component may be a primitive type (such as byte, int, or double),
 *       a reference type (such as String, Object, or java.nio.CharBuffer),
 *       or an array.
 *   - Multi-dimensional arrays are really just arrays which contain components of array type.
 *
 * 从真实需求开始
 *   如果我们想存储 100 个人的名字，如何操作？
 *     - 定义 100 个变量？
 *     - 我们可以创建一个可以存储 100 个名字的字符串类型的数组
 *
 * 数组的内存空间的连续的
 *   类比生活中的场景
 *     - 两个人（亲密无间）
 *     - 饭馆、电影院、动车
 *
 */
public class ArrayBasic {
    public static void main(String[] args) {
        // 1. 数组的声明和初始化

        // 静态初始化
        String[] names; // 声明
        names = new String[]{"小早", "小上", "小好"}; // 初始化

        // 动态初始化
        /*
        int[] ages = new int[size];
        ages[index] = value;
         */

        // 其他写法
        /*
        int ages2[] = new int[3];
        String[] names2 = {"a", "b", "c"};
         */

        // 判断题
        /*
        下面哪种方式是正确的创建数组写法

        A.
        int[] numbers = {1, 2, 3, 4, 5};

        B.
        int numbers = {1, 2, 3, 4, 5};

        C.
        int[] numbers = [1, 2, 3, 4, 5];

        D.
        以上所有
         */

        // 2. 访问数组元素
        /*
        index: 0 ～ x-1
        输出 names 的 0，1，2，3
        ArrayIndexOutOf...
        why from 0?

        update value
        ArrayIndexOutOf...
         */

        // 3. 数组的大小
        /*
        属性：length
         */

        // 4. 遍历数组
        /*
        sout, fori
         */
    }
}