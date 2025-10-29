package week_2.ch7.ex04_interface_implicit_modifiers;

public interface Soar {
    // constants/ interface variable -> implicit public static final
    // protected & private not allowed
    // package is interpreted as public
    int MAX_HEIGHT=2;
    final static boolean UNDERWATER=true;

    // methods without body (); -> implicit public abstract
    // protected & private not allowed
    // package is interpreted as public
    void fly();

    public abstract double dive();

    //methods with body - may be private, static, default
    default void play(){}
}
