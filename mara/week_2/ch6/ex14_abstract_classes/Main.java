package week_2.ch6.ex14_abstract_classes;

public class Main {
    public static void main(String[] args) {
        Canine f = new Fox();
        f.bark();//ofc fox sound
        //even if the variable reference is Canine
        //the fact that is abstract -> using the implem to instantiate
    }
}
