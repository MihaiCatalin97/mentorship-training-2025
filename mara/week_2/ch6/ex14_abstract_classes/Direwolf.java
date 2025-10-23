package week_2.ch6.ex14_abstract_classes;

public class Direwolf extends Canine{
    // this won t compile as it declares an abstract method but
    // the class is not abstract >
    // public abstract rest();
    public String getSound(){
        return null;
    }
    //VARIABLES CANNOT BE MARKED ABSTRACT
    //public abstract String name;
}
