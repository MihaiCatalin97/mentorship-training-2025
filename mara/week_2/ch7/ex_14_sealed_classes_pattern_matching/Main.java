package week_2.ch7.ex_14_sealed_classes_pattern_matching;

import week_2.ch7.ex_13_sealed_interfaces.Duck;
// if Fish was not an abstract class - this switch expression would require
// default, but being abstract - all cases are covered by the subclasses in
// the permits list - making it exhaustive
public class Main {
    public static String getType(Fish fish) {
        return switch (fish) {
            case Trout t -> "Trout";
            case Bass b -> "Bass";
        };
    }

    public static void main(String[] args) {
        Fish f = new Bass();
        System.out.println(getType(f));
    }
}
