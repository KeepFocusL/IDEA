package final_demo;

public class FinalVariable {
    final int instanceVariable;

    public FinalVariable() {
        // 如果注释下面的代码，就类似于留了一个后门，
        // 从这个后门进来时 instanceVariable 没有初始值，与 final 冲突了
        instanceVariable = 1;
    }

    /*public FinalVariable(int instanceVariable) {
        this.instanceVariable = instanceVariable;
    }*/

    {
        instanceVariable = 10;
    }
}
