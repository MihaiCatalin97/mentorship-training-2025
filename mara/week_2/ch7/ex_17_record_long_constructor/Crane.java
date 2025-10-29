package week_2.ch7.ex_17_record_long_constructor;

//no braces
//used for checks/ validations
// you can work with the parameters, not the fields
public record Crane(int numberOfEggs, String name) {
    public Crane {
        if (numberOfEggs < 1) {
            throw new IllegalArgumentException();
        }
        name = name.toUpperCase();
        // modifying directly the fields won t compile > this.name = name.toUpperCase();
        // at the end of the compact constructor, the long constructor is called automatically
    }
}
