package week_2.ch7.ex02_interface_extended;

//first concrete class - it must implement all abstract, inherited methods
//a class can extend 1 class
//a class can implement many interfaces ~ public class Owl implements Nocturnal, CanFly
//an interface can extend many interfaces
//traps> C extends I | I implements I | I extends C
public class Owl implements HasBigEyes {
    @Override
    public int hunt() {
        return 10;
    }

    @Override
    public void flap() {
        System.out.println("wow");
    }
}
