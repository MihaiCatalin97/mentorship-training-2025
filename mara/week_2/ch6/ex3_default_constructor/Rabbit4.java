package week_2.ch6.ex3_default_constructor;
/*
* Having only private constructors in a class tells the compiler not to provide a default no-argument constructor
* It also prevents other classes from instantiating the class.
* */
public class Rabbit4 {
    private Rabbit4(Boolean b) {
    }
}
