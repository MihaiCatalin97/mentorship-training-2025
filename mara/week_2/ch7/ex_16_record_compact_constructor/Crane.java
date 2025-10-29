package week_2.ch7.ex_16_record_compact_constructor;
//THE LONG CONSTRUCTOR
//-the constructor the compiler normally inserts automatically
// however, if you implement it  - the compiler won t generate
// all the fields should be set, due to being final
//this won t compile > public Crane (int numberEggs, String name) {}

public record Crane(int numberEggs, String name) {
    public Crane (int numberEggs, String name) {
        this.numberEggs = numberEggs;
        this.name = name;
    }
}
