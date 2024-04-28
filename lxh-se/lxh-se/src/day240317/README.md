- ![d53f8a755c6cc0fc9beba634bf2cf37.png](img%2Fd53f8a755c6cc0fc9beba634bf2cf37.png)
* 1.state behavior
* 2.filed
* 3.method
* 4.encapsulation
* 5.class
* 1.Real-world objects contain ***state*** and ***behavior***
* 2.A software object's state is stored in ***filed***
* 3.A software object's behavior is exposed through ***method***
* 4.Hiding internal data from the outside world,and accessing it only through publicly exposed methods is known as date ***encapsulation***
* 5.A blueprint for a software object is called a ***class***

## ctrl+shift+u 快捷切换代码大小写

## Exercises

### *Real-world objects -> Software objects*

- ![Exercises.png](..%2Fday240313%2Fimg%2FExercises.png)

## IDEA - Structure

- ![IDEA-Structure.png](..%2Fday240313%2Fimg%2FIDEA-Structure.png)

## Inheritance(继承)

https://docs.oracle.com/javase/tutorial/java/concepts/inheritance.html

https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html

### v1

- ![inheritance.v1.png](..%2Fday240313%2Fimg%2Finheritance.v1.png)

### extends(类名后面加 + extends + 继承的类名)

### v2

- ![inheritance.v2_1.png](..%2Fday240313%2Fimg%2Finheritance.v2_1.png)

- ![inheritance.v2_2.png](..%2Fday240313%2Fimg%2Finheritance.v2_2.png)

### v3

- 问题：为什么能“点”出这些没见过的方法

    - ![dot-other-behavior.png](..%2Fday240313%2Fimg%2Fdot-other-behavior.png)

        - persion.getClass().getSuperclass()

            - java.lang.Object

                - ![Object-Structure.png](..%2Fday240313%2Fimg%2FObject-Structure.png)

### v4

- @Deprecated (表示此方法已废弃、暂时可用，但以后此类或方法都不会再更新、后期可能会删除，建议后来人不要调用此方法。)

-    ![Deprecated_1.png](..%2Fday240313%2Fimg%2FDeprecated_1.png)
-    ![Deprecated_2.png](..%2Fday240313%2Fimg%2FDeprecated_2.png)
### v5

- Override

    - ![Override.png](..%2Fday240313%2Fimg%2FOverride.png)

### v6

- toString

    - ![toString.png](..%2Fday240313%2Fimg%2FtoString.png)

- override toString

    - ![override-toString.png](..%2Fday240313%2Fimg%2Foverride-toString.png)

## Debug

![Debug_1.png](..%2Fday240313%2Fimg%2FDebug_1.png)
![Debug_2.png](..%2Fday240313%2Fimg%2FDebug_2.png)


# 继承
* 要继承的名字加.getClass().getSuperclass()

### 按住ctrl再点击要进去的方法名进入方法源码(Object)

![img_1.png](img%2Fimg_1.png)
学习idea功能