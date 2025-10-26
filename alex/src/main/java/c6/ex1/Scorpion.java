package c6.ex1;

public class Scorpion extends Arachnid {
    static
    { sb.append("q"); }
    { sb.append("m"); }
    public static void main(String[] args) {
        System.out.print(Scorpion.sb + " ");
        System.out.print(Scorpion.sb + " ");
        new Arachnid();
        //adaug inca un obiect
        new Scorpion();
        new Scorpion();
        System.out.print(Scorpion.sb);
    } }