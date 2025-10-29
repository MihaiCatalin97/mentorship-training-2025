package week_2.ch7.ex_26_polymorphism_overriding;

//OVERRIDING
/* is considered real polymorphism -
in this scenario, even if the printInfo is defined in parent class
would call the getHeight method overridden in the subclass
book> Polymorphism’s ability to replace methods at runtime via overriding is one
of the most important properties of Java
* ++ you can choose to limit polymorphic behavior by marking methods final
* */
class Penguin {
    public int getHeight() {
        return 5;
    }

    public void printInfo() {
        System.out.println(getHeight());
    }
}

public class Emperor extends Penguin {
    public int getHeight() {
        return 100;
    }
    // to indicate that you want to use the parent method
    // override print & specify super.method() as follows:

//    @Override
//    public void printInfo() {
//        System.out.println(super.getHeight());
//    }

    public static void main(String[] args) {
        new Emperor().printInfo();
    }
}
