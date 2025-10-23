package week_2.ch6.ex13_final_methods;

public class Penguin extends Bird{
//    public final boolean hasFeathers(){
//        return false;// won t compile as final methods cannot be overriden
//    }
//    public final static void flyAway(){
//static - it cannot be hidden in the subclass
//    }
}
/*This rule applies only to inherited methods
 For example, if the two methods were marked private in the parent Bird class,
  then the Penguin class, as defined, would compile
   In that case, the private methods would be redeclared, not overridden or hidden.
* */