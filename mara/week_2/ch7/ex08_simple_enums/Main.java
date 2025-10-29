package week_2.ch7.ex08_simple_enums;

public class Main {
    public static void main(String[] args) {
        var s = Season.WINTER;
        System.out.println(Season.WINTER);//toString()
        String period = Season.WINTER.name();
        int index = Season.WINTER.ordinal();
        System.out.println("The following period: " + period + ", index: " + index);

        System.out.println(s == Season.WINTER);
        System.out.println(s.equals(Season.SPRING));

        //common methods name(), ordinal(), values(), valueOf(String)
        for (Season season : Season.values()) {
            System.out.println(season);
        }
        var season = Season.valueOf("SPRING");
        System.out.println(season); //this is the opposite of name "string"->enum member
        //careful case sensitive method
        //System.out.println(Season.valueOf("spring")); //IllegalArgumentException

        //Discussing switch expressions
        String placeToVisit = switch (season) {
            case SPRING -> "Turkey";
            case Season.SUMMER -> "Greece";
            case FALL, WINTER -> "Switzerland";
            default -> "home";
        };
        //the default case becomes optional as the switch is already exhaustive
        System.out.println("I can't wait to visit " + placeToVisit);
    }
}
