package week_2.ch6.ex9_constructors_order;

public class Chimpanzee extends Ape{
    public Chimpanzee() {
        //super(2);
        System.out.println("Chimpanzee constructor");
    }
    public static void main(String[] args) {
        Chimpanzee c = new Chimpanzee();
    }
}
