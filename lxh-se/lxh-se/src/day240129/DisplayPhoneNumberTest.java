package day240129;

/**
 * 问题描述：
 *   已知 array1 和 array2
 *   输出：电话号码
 *   详见：day240223.img/array-tel.png
 *
 *   重点：锻炼思考能力，不要直接去搜索答案
 *   如果已经会的同学
 *      - 改数组，让最终的答案是你的电话号码
 *      - 可能只是靠「经验」，希望大家能达到「能力」的层面
 *      - 参考前一天「九九乘法表」的完整代码实现过程
 *
 */
public class DisplayPhoneNumberTest {
    public static void main(String[] args) {
        int[] array1 = new int[] { 8, 2, 1, 0, 3 };
        int[] array2 = new int[] { 2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3 };

        // 思考过程？
        // 电话号码长什么样？1abcdefghjk => 特征：11位
        //

        // 怎么访问数组元素？
        /*System.out.println(array2[0]);
        System.out.println(array2[1]);
        System.out.println(array2[2]);*/

        // 怎么循环？
        /*for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
        }*/

        // 中间不正确的结果，敢于输出出来，不用把代码写到自己绝对全对才敢运行
        // 结果不对，纠正它即可

        /*for (int i = 0; i < array2.length; i++) {
            int index = array2[i];
            int value = array1[index];
            System.out.print(value);
        }*/

        // 知识点是死的，要把它用活

        String phoneNumber = "";
        for (int i = 0; i < array2.length; i++) {
            int value = array2[i];
            phoneNumber += array1[value];
        }
        System.out.println("phoneNumber：" + phoneNumber);
    }
}