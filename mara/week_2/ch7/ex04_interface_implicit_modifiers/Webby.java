package week_2.ch7.ex04_interface_implicit_modifiers;

public class Webby implements Soar {
    //public is required here because
    //in the interface no modifier = public
    //here, in the class is considered package
    //and in order to override it should be at least as accessible as the inherited method
    public void fly() {
        System.out.println("I'm Webby");
    }

    @Override
    public double dive() {
        return 0;
    }
}
