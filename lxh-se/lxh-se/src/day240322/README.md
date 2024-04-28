### overload重载
* 同一个类多个方法方法名相同，形参改变
### override重写
* 继承父类方法并且重写改变内部参数
* 重写方法签名要相同(方法名和形参数据类型)
* 方法重写前加@Override验证是否方法重写
* 子类和父类方法名相同，如果要调用父类的方法，无参用super()，有参用super(参数)，
* 构造器初始化this.
* 构造器调用父类参数super(),调用本类参数this()，不能this和super一起用，this()和super要在第一行
* 构造器有形参不this.没有初始化则无法被继承
* 调用同类不同方法this(参数，无参不写)
### 权限修饰符

        - 大于等于父类访问权限修饰

        - 无法重写 private 修饰的方法
### this()和super()
* this(参数); //调用本类的构造方法
* super(参数); //调用父类的构造方法
- ![OverRideRule.png](override_detail%2FOverRideRule.png)