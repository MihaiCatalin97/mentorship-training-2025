package week_2.ch7.ex05_default_methods;

/*
rule 1) a default method may be declared only within an interface.
rule 2) it must be marked with the default keyword and include a method body.
rule 3) it is implicitly public.
rule 4) it cannot be marked abstract, final, or static.
rule 5) it may be overridden by a class that implements the interface.
rule 6) If a class inherits two or more default methods with the same method signature,
then the class must override the method.
* */
public interface IsCold {
    boolean hasScales();//required override

    // rule 4) it cannot be abstract(bc is already implemented), final(bc it should allow overriding it),
    // static (instance member)
    default double getTemperature() {//optional override
        return 10.0;
    }
}
