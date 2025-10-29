package week_2.ch7.ex07_private_methods;

public interface ImprovedSchedule {
    default void wakeUp() {
        checkTime(7);
    }

    private void haveBreakfast() {
        checkTime(11);
    }

    static void workOut() {
        checkTime(10); // this time will compile -> rule 3
        //as static methods can access other static methods
    }

    private static void checkTime(int time) {
        if (time > 10) {
            System.out.println("A bit late");
        } else {
            System.out.println("Good! On time");
        }
    }
}
