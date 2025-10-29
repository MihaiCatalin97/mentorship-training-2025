package week_2.ch7.ex_27_not_polymorphism_hiding;

/* >hiding members is not a form of polymorphism since the methods and
   variables maintain  their individual properties
   >unlike method overriding, hiding members is very sensitive to the reference type
   and location where the member is being used.
* */
class Marsupial {
    protected int age = 2;

    public static boolean isBiped() {
        return false;
    }
}

public class Kangaroo extends Marsupial {
    protected int age = 6;

    public static boolean isBiped() {
        return true;
    }

    public static void main(String[] args) {
        Kangaroo kloe = new Kangaroo();
        Marsupial mary = new Marsupial();

        System.out.println(kloe.isBiped());//true
        System.out.println(mary.isBiped());//false

        System.out.println(kloe.age);//6
        System.out.println(mary.age);//2

    }
}
