package week_2.ch6.ex14_abstract_classes;

public abstract class Canine {
    public abstract String getSound();
    public void bark(){
            System.out.println(getSound());
    }
//    public static void main(){
//        var a = new Canine();//NEVER INSTANTIATE AN ABSTRACT CLASS LIKE THIS
//    }
}
