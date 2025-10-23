package week_2.ch6.ex12_method_and_variable_hiding;
/*Method hiding is similar to but not exactly the same as method overriding
  The previous four rules for overriding a method must be followed when a method is hidden.
  In addition, a new fifth rule is added for hiding a method:
  The method defined in the child class must be marked as static if it is marked as static in a parent class.
* */
public class Panda extends Bear {
    public static void eat(){
        System.out.println("Panda is eating");
    }
    public static void main(String[] args) {
        eat();
    }
}
