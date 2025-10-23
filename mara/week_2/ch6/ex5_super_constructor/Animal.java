package week_2.ch6.ex5_super_constructor;

public class Animal {
    private int age;

    public Animal(int age) {
        super();//refers to the constructor in Object
        /*and again, if super() is called, any previous statements in the constructor - prohibited
          also, remember that you can call it only once*/
        this.age = age;
    }
}
