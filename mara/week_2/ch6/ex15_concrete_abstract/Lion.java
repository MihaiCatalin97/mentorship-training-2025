package week_2.ch6.ex15_concrete_abstract;
//the first concrete subclass, it must implement all of the inherited abstract methods
// that are not defined in a parent class
public class Lion extends BigCat{
    public String getName(){
        return null;
    }
    public void roar(){
        System.out.println("must be implemented in here");
    }
}
