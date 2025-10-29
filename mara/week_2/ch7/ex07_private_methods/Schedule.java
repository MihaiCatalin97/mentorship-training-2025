package week_2.ch7.ex07_private_methods;

/* PRIVATE METHODS
rule 1) a private interface method must be marked with the private modifier and include a method body.
rule 2) private static interface method may be called by any method within the interface definition.
rule 3) a private interface method may only be called by default and other private non-static methods within the interface definition.
* */
public interface Schedule {
    default void wakeUp() {
        checkTime(7);
    }

    private void haveBreakfast() {
        checkTime(11);
    }

    static void workOut() {
        //checkTime(10);//won t compile -Rule 3
        //as the static method cannot access instance methods
        //solution> add static to checkTime -> ImprovedSchedule interface
    }

    private void checkTime(int time) {
        if (time > 10) {
            System.out.println("A bit late");
        } else {
            System.out.println("Good! On time");
        }
    }
}
