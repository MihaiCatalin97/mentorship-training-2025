package week_2.ch6.ex11_initialization_inherit_order;

public class Okapi extends GiraffeFamily {
    static {
        System.out.println("F");
    }
    public Okapi(int stripes) {
        super("sugar");
        System.out.println("G");
    }
    {
        System.out.println("H");
    }
    public static void main(String []args){
        new Okapi(1);
        System.out.println();
        new Okapi(2);
    }
}
