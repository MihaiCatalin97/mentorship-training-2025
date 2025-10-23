package week_2.ch6.ex5_super_constructor;

public class Zebra extends Animal {
    public Zebra(int age) {
        super(age);//refers to the constructor in Animal
    }
    public Zebra() {
        this(0); // refers to the constructor in Zebra
    }
}
