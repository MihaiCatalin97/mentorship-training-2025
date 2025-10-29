package week_2.ch7.ex_24_polymorphism;

/*a Java object may be accessed using the following:
A reference with the same type as the object -> Lemur
A reference that is a superclass of the object -> Primate
A reference of an interface the object implements or inherits -> HasTail
However - a single object will be stored in the memory
the reference indicates only what methods/ fields we might use to access it
* */
public class Primate {
    boolean hasHair() {
        return true;
    }
}

interface HasTail {
    boolean isTailedStriped();
}

/* Discussing Object vs Reference
rule1) the type of the object determines which properties exist within the object in memory.
rule2) he type of the reference to the object determines which methods and variables are accessible to the Java program.
* * */
class Lemur extends Primate implements HasTail {
    @Override
    public boolean isTailedStriped() {
        return false;
    }

    public int age = 10;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);

        HasTail hasTail = new Lemur();
        System.out.println(hasTail.isTailedStriped());
        //System.out.println(hasTail.age);

        Primate primate = new Primate();
        System.out.println(primate.hasHair());
        //System.out.println(primate.age);
    }

}

