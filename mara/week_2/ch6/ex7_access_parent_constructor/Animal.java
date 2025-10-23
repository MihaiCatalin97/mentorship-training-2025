package week_2.ch6.ex7_access_parent_constructor;

public class Animal {
    private String name;
    private int age;

    public Animal(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    public Animal(int age) {
        super();
        this.age = age;
        this.name = null;
    }
}
