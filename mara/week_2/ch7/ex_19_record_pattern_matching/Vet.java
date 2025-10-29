package week_2.ch7.ex_19_record_pattern_matching;
record Fish(Object type){}
//MATCH on FIELD TYPE
public class Vet {
    public static void main(String[] args) {
        Fish f1 = new Fish("Nemo");
        Fish f2 = new Fish(Integer.valueOf(12));

        if (f1 instanceof Fish(Object t)) {
            System.out.println("Match 1");
        }
        if (f1 instanceof Fish(String t)) {
            System.out.println("Match 2");
        }
        //false, but would compile as Object is the param type of the record
        // > Fish (Object type)
        //but if we change it to Integer > Fish(Integer type)- compile error
        if (f1 instanceof Fish(Integer t)) {
            System.out.println("Match 3");
        }
        if (f2 instanceof Fish(String t)) {
            System.out.println("Match 4");
        }
        if (f2 instanceof Fish(Integer t)) {
            System.out.println("Match 5");
        }
    }
}
