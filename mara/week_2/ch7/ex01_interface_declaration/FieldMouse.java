package week_2.ch7.ex01_interface_declaration;

//the override annotation is optional
//the method should have the exact same signature as the interface method
//covariant return type (Float, Number) !not String - compilation error
public class FieldMouse implements Climb {
    @Override
    public Float getSpeed(int age) {
        return null;
    }
}
