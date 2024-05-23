看到day240303
String类型直接sout出的是地址，所以要用toString
## 把构造器private起来怎么new
* 加static在本类new  (static Student instance = new Student();)
### 想不让外部改变static值怎么办
* 在方法前面加 private static Student instance = new Student();
* private起来一个static对象无法直接调用，要写一个公开的static getXxx方法调用，返回类型Student {return instance}
* 用final关键字;  private static final Student instance = new Student();
* 父类中静态成员可以被继承，如果子类有和父类相同的静态成员，父类静态成员不会被重写(override)而是被隐藏。
* 强转int 转换double无损，double转换int有损
* String + 基础数据类型 = String
* day240126
* Java中 package-private = no modifier