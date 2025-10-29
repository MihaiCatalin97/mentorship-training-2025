package week_2.ch7.ex09_complex_enums;

//The first time we ask for any of the enum values,
// Java constructs all of the enum values.
public class Main {
    public static void main(String[] args) {
        System.out.println("start>");
        var firstCall = SeasonWithVisitors.SUMMER; // print 4 times
        System.out.println("next call>");
        var secondCall = SeasonWithVisitors.SUMMER; //doesnt print anything

        //CALLING A METHOD enumVal.method
        SeasonWithVisitors.SUMMER.printVisitors();
    }
}
