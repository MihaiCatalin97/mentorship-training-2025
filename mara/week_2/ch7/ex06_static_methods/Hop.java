package week_2.ch7.ex06_static_methods;

/* STATIC METHODS RULES
rule 1) it must be marked with the static keyword and include a method body.
rule 2) a static method without an access modifier is implicitly public
        * package & public -> public
        * private -> allowed (ex_08)
        * protected -> not allowed
rule 3) it cannot be marked abstract or final
rule 4) is not inherited and cannot be accessed in a class implementing the interface without
a reference to the interface name
*/
public interface Hop {
    static int getJumpHeight() {
        return 20;
    }
}
