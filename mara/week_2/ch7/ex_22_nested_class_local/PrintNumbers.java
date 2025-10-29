package week_2.ch7.ex_22_nested_class_local;

/* 3) LOCAL CLASS
-> a class inside a method, constructor, initializr block
-> might access all instance variable of the outer class (including private ones)
   !!!!!!!!!!!!!!!IF THE METHOD IS AN INSTANCE METHOD
   >if calculate() would be static -> length variable won t be accessible
-> also might access local variables if they re <<< final or effective final>>
-> access modifiers/specifiers: private, public, package, protected, abstract, final
-> its scope depends on the method/block
 */
public class PrintNumbers {
    private int length = 5;

    public void calculate() {
        //final int width=20;
        int width = 20;
        class Calculator {
            public void multiply() {
                System.out.println(length * width);
            }
        }
        // won t compile as it would not be effective final anymore
        // width=200;
        var calculator = new Calculator();
        calculator.multiply();
    }

    public static void main(String[] args) {
        PrintNumbers p = new PrintNumbers();
        p.calculate();
    }

}
