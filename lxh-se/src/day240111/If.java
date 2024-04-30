package day240111;

/**
 * 分支结构之 if-else
 */
public class If {
    public static void main(String[] args) {
//        ifStatement1(18);
//        ifStatement2(18);
        ifStatement3(70);
    }

    public static void ifStatement1(int age) {
        if (age >= 18) {
            System.out.println("恭喜，你可以...了");
        }
        /*
        if ()
            //
         */
    }

    public static void ifStatement2(int age) {
        if (age >= 18) {
            System.out.println("恭喜，你可以...了");
        } else {
            System.out.println("小朋友，你好呀");
        }
    }

    public static void ifStatement3(int score) {
        if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 70) {
            System.out.println("良好");
        } else if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }
}
