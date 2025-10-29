package week_2.ch7.ex_19_record_pattern_matching;

record Monkey(String name, int age) {
}

public class Zoo {
    public static void main(String[] args) {
        Object animal = new Monkey("George", 3);
        if (animal instanceof Monkey(String name, int age)) {
            System.out.println(name + " " + age);
        }
        if (animal instanceof Monkey(Object name, int age)) {
            System.out.println(name + " " + age);
        }
        if (animal instanceof Monkey myMonkey) {
            System.out.println(myMonkey.age() + " " + myMonkey.name());
        }

    }
}
