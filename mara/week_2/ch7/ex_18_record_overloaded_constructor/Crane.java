package week_2.ch7.ex_18_record_overloaded_constructor;

public record Crane(int numberOfEggs, String name) {
    public Crane(int numberOfEggs, String firstName, String lastName) {
        //firstName = firstName.toUpperCase();//COMPILE & effect applied
        this(0, lastName + firstName);
        //WOULD COMPILE - but no effect - it should be previous to this() call
        lastName = lastName.toLowerCase();
        //again this won t compile -> this.numberOfEggs = 10;
        //only working with parameters
    }
}
