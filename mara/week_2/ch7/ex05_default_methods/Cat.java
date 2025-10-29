package week_2.ch7.ex05_default_methods;

public class Cat implements Walk, Run {
    //it would not compile without overriding the default method - rule 6
    //as it is present in both Walk & Run interfaces

    @Override
    public int getSpeed() {
        return 100000;
    }
    //overriding the conflicting method, the ambiguity about which version of the method
    // to call has been removed

    //Calling the default method
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.getSpeed());//instance.method
        //System.out.println(Walk.getSpeed()); Interface.method - won t compile
    }

    public int callingOriginalSpeedMethod() {
        return Walk.super.getSpeed();// <-accessing the original method interface.super.method
        //return Run.super.getSpeed();
        //careful! this won t work in main as main is static - & this is depending on the instane
    }
}
