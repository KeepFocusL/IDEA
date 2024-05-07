# oop
* in oop,we create objects to solve complex problems.

## 1.吃晚饭，你会怎么做
### 面向对象vs面向过程
* 面向过程：自己做，出去吃，点外卖
* 面向对象：别人帮你做
* 狗的行为不能放在人身上

### What‘s an object
* 这种建模方式，灵感是来自现实生活（blueprint or prototype）
* 关键词：software bundle,related state and behavior

## what’s a Class(怎么定义Class)

### 1.class-name
* 1.单词首字母应大写，如果类名由多个单词组成，每个单词的首字母都应大写
* 2.严格区分大小写
* 3.不能是JAVA中的保留字和关键字
* 4.类名要跟文件名相同
* 5.不能以数字开头
### 2.class-body
* 1.Modifier：`public`、`protected`、`no modifier`、`private`

| Modifier    | Class | Package | Subclass | World |
|-------------|-------|---------|----------|-------|
| private     | √     | ×       | ×        | ×     |
| no modifier | √     | √       | ×        | ×     |
| protected   | √     | √       | √        | ×     |
| public      | √     | √       | √        | √     |

* 2.声明成员变量
* 类中的成员变量 - 这些变量称为字段
* 3.变量名/方法名/参数名：首字母要小写。如果以多个单词命名，第一个单词首字母小写，之后的单词首字母要大写。方法名要以动词开头
#### 1.state(field,variable)
* instance variable（Non-Static fields）
* Class variable(Static fields)
* Local variable方法内部变量... 
* parameter形参 argument实参
* field 形式之总体：变量类型 变量名 = 变量值；
* String name；==>初始值
* 值不想被改变使用final(使用final后变量将变为全局常量，变量名要全部大写，如final int AGE = 18;)

#### 1.变量的数据类型(四类八种)：
##### 基础数据类型
##### 1.整型（byte、short、int、long）
* 位=bit，1bit代表一个二进制数，字节=byte
* 举例：int的取值范围是 -2的31次幂到2的31次幂-1，大家都知道他是由32位二进制数组成，所以就是32/8 = 4 字节。
* byte 8位(1字节）
* short 16位 (2字节)
* int 32位 (4字节)
* long 64位 (8字节) 赋值后面不加L或l，会默认转换位int类型，如果赋值的数超过了int类型，会报错
* 字面量char/byte/short参与计算时候的自动转化

##### 2.浮点型（float、double）
* float 32位(4字节) 赋值后面不加F或f ，会默认转换为double类型
* double 64位(8字节)

##### 3.字符型(char)
* char 16位(2字节)
* char类型赋值时，需要用单引号''把字符括起来，例如‘a’
* 转义字符(/n 、/t)
* /n 换行
* /t 空格 

##### 4.布尔型（boolean) 
* boolean 只有ture和false两个值,初始值为false

##### 分支 
* if - else 
* switch
###### 三元运算符
* (关系表达式) ? 表达式1 : 表达式2;
* int x = 10;
* int y = 5;
* int z;
* 如果x大于y 则是true，将x赋值给z；
* 如果x不大于y 则是false，将y赋值给z；
* z = (x > y) ? x : y;
* System.out.println("x = " + x);
* 获取三个整数中的最大值
* int a = 10;
* int b = 20;
* int c = 30;
* 先比较任意两个数的值，找出这两个数中的最大值
* int temp = (a > b) ? a : b;
* 用前两个数的最大值与第三个数比较，获取最大值
* int max = (temp > c) ? temp : c;
* System.out.println("max = " + max);

##### 2.引用数据类型
###### 1.类引用：
* Object(Scanner,Random,equals,......),void,String(toString),初始化new,Heap和stack
###### 2.数组引用:
* int[],String[],初始化new
###### 3.接口interface：
* ###暂缺###

#### 2.behavior(method,function)
#### 方法声明有六个组件
* 1.修饰符：Modifier
* 2.返回类型: 方法返回的数据类型，如果方法不返回值，则返回void
* 3.方法名：首字母要小写。如果以多个单词命名，第一个单词首字母小写，之后的单词首字母要大写。方法名要以动词开头
* 4.参数列表：参数写在括号中(参数1，参数2,...... 参数=变量类型 变量名)，如果没有参数，则必须使用空括号()
* 5.方法体：
* overload(重载)→同一个scope里，变量不能同名，方法不能同名
* JAVA虚拟机JVM只看方法签名(方法名+参数类型列表)
* 6.异常列表{暂时先忽略}

#### 3.constructor
* (核心目的：初始化state)
* 如果自己没写，会自动为我们生成一个空参的构造器（out/...class)

#### this关键字
* 引用类中字段或方法用this关键字
#### 代码块

#### static关键字
* 全局变量
#### super关键字
* 如果子类重写方法需要引用父类方法用super关键字
#### 命名规范
* 1.包名全部小写
* 2.常量名：所有字母都要大写，如果由多个单词组成，用下划线_连接两个单词