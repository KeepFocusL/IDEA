## 通过阅读 ArrayList 源码，我们知道：
*
    1. 底层是用 Object[] elementData 来存储的
*
    2. 当只是 new ArrayList<>() 的时候，这个还没给它指定大小
* 跟 StringBuilder 不一样，StringBuilder 只要 new 出来，哪怕还没 append，就已经分配长度16了
*
    3. 什么时候真正开始给 Object[] 指定长度？ => add 的时候（when first element is added）
* 本质上是在原本的数组上增加长度