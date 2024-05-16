package final_demo;

public class FinalMethod {
    public final void fm () {}
}

class SubFinalMethod extends FinalMethod {
    // cannot override 'xxx()' in 'XXX'; overridden method is final
//    @Override
//    public void fm() {}
}
