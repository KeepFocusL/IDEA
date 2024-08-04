## 回顾

- 见上次课的笔记

## 阅读时间

###

- 中文资料: https://www.ruanyifeng.com/blog/2013/04/processes_and_threads.html
- 英文资料: https://docs.oracle.com/javase/tutorial/essential/concurrency/procthread.html

### 注意点

- 尽信书,不如无书
- 读文章,要抱有怀疑的态度
- 注意翻译的准确度
- 评论区出人才,有评论区多翻翻评论区,可能会有惊喜
- ![img.png](img.png)

## 肉眼可见的一个软件就是一个执行路径(一个进程)

### 直观 `线程` 和 `进程`

- ![img_1.png](img_1.png)

### main也是一个执行路径(一个进程)

## Thread Introduction

- ![img_6.png](img_6.png)

## Thread 开辟新路径的方式一和方式二

- ![img_7.png](img_7.png)

## 给线程指定名字

- ![img_11.png](img_11.png)

## Thread - Calls to `run()` vs `start()`

- ![img_8.png](img_8.png)

## Thread - 思考：`extends Thread` VS `implements Runnable`

- ![img_9.png](img_9.png)

## Thread - `原始的写法` vs `匿名 Runnable 子类` vs `lambda 表达式`

- ![img_10.png](img_10.png)

## 小总结

- `线程`简单理解：它就是一条执行路径
- 如何开辟执行路径：`new Thread(...).start();`
- 在这条新开辟的执行路径上要做什么任务：包在 `run` 方法里面

## Thread - 通过控制台的输出直观感受 - 线程状态 - `不确定`

![img_12.png](img_12.png)

## Thread - 通过阅读源码的方式，看线程的状态 `Thread.State`

![img_13.png](img_13.png)

## 布置了课后作业

- ![img_14.png](img_14.png)

## IDEA 编辑器快速抽取方法的方式

- 选中内容 => hover => 稍等片刻能看到下图
    - ![img_15.png](img_15.png)
- 选中内容 => 右击
    - ![img_16.png](img_16.png)
- 快捷键的方式，见上图👆

## Thread 常用方法

- `Thread.sleep`
    - ![img_20.png](img_20.png)
- `join`
    - ![img_21.png](img_21.png)
- `Thread.yield`
    - ![img_17.png](img_17.png)
- `setPriority`
    - ![img_18.png](img_18.png)
- `isAlive`
    - ![img_19.png](img_19.png)

## synchronized

### 直接写在方法声明中

- ![img_22.png](img_22.png)

### 锁在更精确的位置上

- ![img_23.png](img_23.png)
- ![img_24.png](img_24.png)
- 上两张图的 `this` 和 `xxx.class` 可以替换成下图的实现方式
    - ![img_25.png](img_25.png)

## 死锁 Deadlock

- ![img_26.png](img_26.png)
- ![img_27.png](img_27.png)

## TicketWindows 模拟车站买票的场景

- 版本1 - ArrayList
    - ![img_28.png](img_28.png)
    - ![img_29.png](img_29.png)
- 版本2 - Vector
    - ![img_30.png](img_30.png)
    - ![img_31.png](img_31.png)
- 版本3 - Vector + Thread.sleep
    - ![img_32.png](img_32.png)
- 版本4 - synchronized
    - ![img_33.png](img_33.png)
- 版本5 - ConcurrentLinkedQueue
    - ![img_34.png](img_34.png)