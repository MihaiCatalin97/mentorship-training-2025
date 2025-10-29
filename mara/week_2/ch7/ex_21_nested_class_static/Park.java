package week_2.ch7.ex_21_nested_class_static;
/* 2) STATIC CLASS
-> it can’t access instance variables or methods declared in the outer class.
-> The outer class can refer to the fields and methods of the static class - including the private ones
-> access modifiers/specifiers: private, public, package, protected, abstract, final
INSTANTIATE A STATIC CLASS
a static nested class can be instantiated without an instance of the OUTER class
* */
public class Park {
    static class Ride{
        private int price = 6;
        public static void main(String[] args) {
            var ride = new Ride();//we don't need an instance of the outer class to call this
            System.out.println(ride.price);
        }
    }
}
