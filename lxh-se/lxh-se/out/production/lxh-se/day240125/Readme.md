## 循环
* For 用于知道循环总次数
* System.out.println("Hello World!");

        /*
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
* for循环更合适事先知道循环总次数的场景，一般与计数器或数组结合一起使用。

* If 对立
* int max = (x >= y) ? x : y;
  if (x >= y)
  System.out.println(x);
  else
  System.out.println(y);
* 真 表达进入if 最后结束if语句
* 假 表达进入else 最后结束if语句

* While 在一定范围内循环且不知道循环总次数
* // 遍历1-100以内的所有偶数
  int i = 1;
  while (i<= 100){
  if (i % 2 == 0){
  System.out.println(i);
  }
  i++; //i= i + 1;
* while循环更合适事先不知道循环总次数的场景，以达到某个目标为目，例如超女选秀，报名有多少人没关系，已选够10位或没人可选是循环的结束。

## （break/continue）
continue 可以使循环在某个位置跳过
break 可以使循环在某个位置停止

## Switch
使用 case 记得使用break结束
都没有结果
* default:
System.out.println("输入有误！");

input 输入
exchangeRate 汇率
temp 交换变量（交换值）
switch 分支语句
increment 增加
calculate 计算
loop 循环


## ++在前 全部都计算出结果
    int a1 = 10;
    int b1 = ++a1;
    System.out.println("a1 = " + a1 + ",b1 = " + b1);
    // a1 = 11 b1 = 11

## ++在后 运算++的数
    int a2 = 10;
    int b2 = a2++;
    System.out.println("a2 = " + a2 + ",b2 = " + b2);
    // a2 = 11 b2 = 10
i++：先用后加 
int m = 2;
int n = 3;
n *= m++;// n = n * m++
System.out.println("m="+m);
System.out.println("n="+n);
m=3 n=6
++i：先加后用
--同理
