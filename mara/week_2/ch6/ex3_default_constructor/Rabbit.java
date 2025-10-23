package week_2.ch6.ex3_default_constructor;

public class Rabbit {
    public static void main(String[] args) {
        new Rabbit(); // calls the default constructor
        new Rabbit2(); //calls the user defined constructor
        //new Rabbit3(); //does not compile as the constructor has a parameter
                       // the compiler didn't create a default one
        new Rabbit3(true);
        //new Rabbit4(); //doesn't compile as the constructor is private
    }
}
