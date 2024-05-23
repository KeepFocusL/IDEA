## 题目 + 答案

### 1. 在白板上写出 HelloWorld 程序

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

### 2. Java 文档注释的格式是什么？

```java
/**
 * 文档注释
 */
public class E02 {
}
```

### 3. 下列语句会报错吗，为什么？

```java
public class E03 {
    public static void main(String[] args) {
        int $j = 2;
        // 不会报错。
        // 可以以 `$` 符号开头，但是不建议
    }
}
```

### 4. 写出下列程序的输出结果

```java
public class E04 {
    public static void main(String[] args) {
        int i1 = 1;
        int i2 = 2;
        int i3 = i1++ + ++i2;
        System.out.println(i1); // 2
        System.out.println(i2); // 3
        System.out.println(i3); // 4
    }
}
```

### 5. 写出下列程序的输出结果

```java
public class E05 {
    public static void main(String[] args) {
        short s = 3;
        s = s + 1; // 这行会报错
        // 原因：此时字面量的 1 默认是 int 类型，所以结果不能用 short 类型的 s 接收
        // 要么强制转换，要么用 int 接
        System.out.println(s);
    }
}
```

### 6. 写出下列程序的输出结果

```java
/**
 * 结果：
 * branch-1
 * num1 = 2
 */
public class E06 {
    public static void main(String[] args) {
        boolean b1 = false;
        int num1 = 1;
        if (b1 | (num1++ == 1)) {
            System.out.println("branch-1");
        } else {
            System.out.println("branch-2");
        }
        System.out.println("num1 = " + num1);
    }
}
```

### 7. 写出下列程序的输出结果

```java
/**
 * 结果：
 * z = 44
 */
public class E07 {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        short z = 40;
        if ((z++ == 40) && (y = true)) {
            z++;
        }
        if ((x = false) || (++z == 43)) {
            z++;
        }
        System.out.println("z = " + z);
    }
}
```

### 8. 写代码输出 100 以内的所有质数

- 质数：只能被1和它本身整除的自然数。
- 如：2, 3, 5, 7, 11, 13, 17, 19, 23 ...

```java
public class E08 {
    public static void main(String[] args) {
        boolean isPrime = true;

        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }

            // reset
            isPrime = true;
        }
    }
}
```

### 9. 分析以下`评委打分`的需求，并用代码实现：

- 已知：在编程竞赛中，有 10 位评委为参赛的选手打分，分数分别为：[5, 4, 6, 8, 9, 0, 1, 2, 7, 3]
- 求：选手的最后得分
- 算法要求：去掉一个最高分和一个最低分后，计算其余 8 位评委打分的平均值

```java
public class E09 {
    public static void main(String[] args) {
        int[] scores = {5, 4, 6, 8, 9, 0, 1, 2, 7, 3};
        // 声明三个特征值
        int sum = 0;
        int max = scores[0];
        int min = scores[0];

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i]; //累加总分
            //用于获取最高分
            if (max < scores[i]) {
                max = scores[i];
            }
            //用于获取最低分
            if (min > scores[i]) {
                min = scores[i];
            }
        }

        int avg = (sum - max - min) / (scores.length - 2);
        System.out.println("去掉最高分和最低分之后，平均分为：" + avg);
        // 思路
        /*
        - 总和、最大值、最小值
        - (总和 - 最大值 - 最小值) / (人数 - 2)
         */
    }
}

```

## 10. 如何给 xx 和 yy 赋值

```java
public class E10 {
    public static void main(String[] args) {
        int[] xx, yy[];
        // xx = 你的代码;
        // yy = 你的代码;
    }
}
```

### 11. 以下选项会报错的是？

```java
public class E11 {
    public static void main(String[] args) {
        int[] xx, yy[];
        // 前提：
        // 假设已经给 xx 和 yy 赋值了

        // xx = 你的代码
        // yy = 你的代码

        // 问：
        // 在以下 A 到 F 的选项中，打开注释之后哪些不会报错？

        /*
        xx[0] = yy;        // A
        yy[0] = xx;        // B
        yy[0][0] = xx;     // C
        xx[0][0] = yy;     // D
        yy[0][0] = xx[0];  // E
        xx = yy;           // F
        */
    }
}
```

### 12. 如何确保以下的 Student 类，有且仅有一个实例

```java
public class Student {
    // 1. state (field, variable)

    // 3. constructor

    // 2. behavior (method, function)
}
```

### 13. 如何用 JavaScript 代码修改当前视频的播放倍速？

![img.png](img%2Fimg.png)


