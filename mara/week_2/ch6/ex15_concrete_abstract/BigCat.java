package week_2.ch6.ex15_concrete_abstract;
//BigCat extends Animal but is marked as abstract
// therefore, it is not required to provide an implementation for the getName() method.
public abstract class BigCat extends Animal {
//    public String getName(){
//        return null;
//    }
//    i can implement it here, but not required
    //if i offer an implementation the subclass will treat it as a normal method
    protected abstract void roar();
}
