package week_2.ch6.ex4_this_constructor;

public class Hamster {
    private String color;
    private int weight;

    public Hamster(String color, int weight) {
        this.color = color;
    }

    public Hamster(String color) {
        this.color = color;
        weight = 50;
        //this("Not possible");//another RULE -unfortunately a constructor could not call itself
        //nor - two constructors can call each other - as it will create a loop
        // this(weight); //and in the next constructor smth like this(color);!NOT ALLOWED
    }

    public Hamster(int weight) {
        //System.out.println("not ok!!!"); //OFC comments don't count as statements :)
        //new Hamster("default orange",weight);//this implies creating an extra object
        this("orange", weight);
        //if you decide to call this() constructor ! be aware that it must be the first statement
        //any extra previous statements will cause comp err (java: call to this must be first statement in constructor)
    }
    public static void main(String[] args) {
        new Hamster(15);
    }
}
