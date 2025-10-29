package week_2.ch7.ex06_static_methods;

public class Skip implements Hop {
    public int skip() {
        return Hop.getJumpHeight();//interface.method
    }
}
