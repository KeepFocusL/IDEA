## 常量池(constant pool)

* ![1.png](img%2F1.png)

### 查看.class文件的第一种方式

* ![2.png](img%2F2.png)

### 查看.class文件的第二种方式

* ![3.png](img%2F3.png)

### 查看.class文件的第三种方式

### q2

* 命令行: javap -verbose out/production/iae-se/day240525/string_interview/Q2.class
* ![4.png](img%2F4.png)

### q1

* ![5.png](img%2F5.png)


* .intern() 要求主动走常量池
* final 常量 ---> 走常量池
* ![6.png](img%2F6.png)

## String储存不同JDK的变化

* ![7.png](img%2F7.png)
* ![8.png](img%2F8.png)

## StringBuilder
* 在StringBuilder中字符串的长度总是小于等于构建器的容量。长度是存储在构建器中的字符串的实际大小，而容量是构建器的当前大小。
如果有更多的字符添加到字符串构建器，超出他的容量，则构建器的容量就会自动增加。在计算机内部，字符串构建器是一个字符数组，因此，构建器的容量就是数组的大小。
如果超出构建器的容量，就用新的数组代替现有数组，新数组的大小为2×（之前数组大小+1）。
