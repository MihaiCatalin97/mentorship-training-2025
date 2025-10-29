package week_2.ch7.ex09_complex_enums;

import week_2.ch7.ex08_simple_enums.Season;

public enum SeasonWithVisitors implements Visitors {
    WINTER("Medium"), SPRING("Medium"), SUMMER("High"), FALL("Low"); // ; required
    //instance & static variables
    private final String visitors;
    public static final String DESCRIPTION = "Weather enum";
    //constructor
    SeasonWithVisitors(String visitors) {
        System.out.println("Enum Constructor");
        this.visitors = visitors;
    }
    //method
    public void printVisitors() {
        System.out.println(visitors);
    }
}
