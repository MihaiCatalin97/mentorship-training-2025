package week_2.ch6.ex6_first_statement_in_construcor;

//The following classes are equivalent - the first line in a constructor must be a call to a super()/this()
//if not provided, the compiler takes care of it
//commented due to the public access modifier
public class Donkey {
}
/*
public class Donkey {
    public Donkey() {}
}
public class Donkey {
    public Donkey() {
        super();
    }
}*/
