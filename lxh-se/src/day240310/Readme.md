## 要运行的内容都要传进main里
## return用法
* 把方法内的值return回main中
* 没有值要返回就直接void
## break和continue的用法
* break跳出循环
* continue终止本次循环，执行下一次循环
## 数据名用instance
## 如果一个变量被赋值一次之后不允许在修改，就可以用final关键字修饰他
* private static final Student instance = new Student
## Java值传递还是引用数据传递
* Java是值传递
# 方法的修饰符可以引用的范围
Modifier：`public`、`protected`、`no modifier`、`private`

| Modifier         | Class | Package | Subclass | World |
|-------------|-------|------| ------ | ------ |
| private     | √     | ×    | ×      | ×      |
| no modifier | √     | √    | ×      | ×      |
| protected   | √     | √    | √      | ×      |
| public      | √     | √    | √      | √      |



Modifier：`public`、`no modifier`、`private`

| Modifier         | Class | Package | Other |
|-------------|-------|------|-----------|
| private     | √     | ×    | ×         |
| no modifier | √     | √    | ×         |
| public      | √     | √    | √         |