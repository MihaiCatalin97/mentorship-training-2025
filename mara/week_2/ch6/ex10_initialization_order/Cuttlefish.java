package week_2.ch6.ex10_initialization_order;
//so the order is static fields, main
// -> instance fields & initializr blocks
//last the constructor
public class Cuttlefish {
    private String name = "swimmy";
    {
        System.out.println(name);
    }
    private static int COUNT=0;
    static {
        System.out.println("Count "+COUNT);
    }
    {   COUNT++;
        System.out.println("Count "+COUNT);
    }
    public Cuttlefish() {
        System.out.println("Cuttlefish Constructor");
    }
    public static void main(String[] args) {
        System.out.println("Main");
        new Cuttlefish();
        new Cuttlefish();
    }
}

/*
Count 0
Main
swimmy
Count 1
Cuttlefish Constructor
*/