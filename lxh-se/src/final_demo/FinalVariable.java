package final_demo;

public class FinalVariable {
    final int instanceVariable;
    final static int CLASS_VARIABLE;

    public FinalVariable() {
        // 如果注释下面的代码，就类似于留了一个后门，
        // 从这个后门进来时 instanceVariable 没有初始值，与 final 冲突了
        //instanceVariable = 1;
        // 如果同时存在`代码块`赋值和构造器赋值，会报下面的错误
        // 因为类似于修改 instanceVariable 的值了，也与 final 的含义冲突了
        // 同时也引申出：new FinalVariable(); 时，先执行了 `代码块`，再调用`构造器`
        // 同时可以通过 `代码块` 解决多个构造器可能不小心留下后门的情况 <=== ***
        // Variable 'instanceVariable' might already have been assigned to
    }

    /*public FinalVariable(int instanceVariable) {
        this.instanceVariable = instanceVariable;
    }*/

    {
        instanceVariable = 10;
    }

    static {
        CLASS_VARIABLE = 3;
    }

    public void localVariableWithFinal() {
        final int i = 9;
        // Cannot assign a value to final variable 'i'
        //i++;
    }

    public void parameterWithFinal(final int x) {
        // Cannot assign a value to final variable 'x'
        //x++;
    }

    public void parameterWithFinal(final MyClass myClass) {
        //myClass.x++; // 可以。myClass 的值（地址值）并没被改变
        //myClass = new MyClass(); // 不行。这里真正了改变了 myClass 的值（地址值）
    }
}

class MyClass {
    int x;
}
