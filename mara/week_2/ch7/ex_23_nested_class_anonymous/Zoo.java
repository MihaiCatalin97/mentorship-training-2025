package week_2.ch7.ex_23_nested_class_anonymous;

/* 4) ANONYMOUS CLASS
-> a class with no name,  declared and instantiated all in one statement using the new keyword,
 a type name with parentheses, and a set of braces {}
-> used to extend an abstract class / to implement an interface
-> a single class/ interface - for multiple us local classes
-> careful at interface methods override - the type must pe public
-> no access modifiers allowed: no > private, public, protected, abstract, final
 */
public class Zoo {
//    abstract class SaleToday{
//        abstract int dollarsOff();
//    }
    abstract interface SaleToday{
        abstract int dollarsOff();
    }
    public int admission(int price){
        SaleToday sale = new SaleToday() {
            @Override
            public int dollarsOff() { //public required for interface override!
                return 0;
            }
        };
        return price - sale.dollarsOff();
    }
}
