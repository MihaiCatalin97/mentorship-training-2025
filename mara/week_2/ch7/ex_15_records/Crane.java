package week_2.ch7.ex_15_records;
/* Members Automatically Added to Records
* Constructor - with the parameters in the same order as the record declaration
* Accessor method: One accessor for each field
* equals(): A method to compare two elements that returns true if each field is equal in terms of equals()
* hashCode(): A consistent hashCode() method using all of the fields
* toString(): A toString() implementation that prints each field of the record in a convenient, easy-to-read format
* */
public record Crane(int numberEggs, String name) {
    public static void main(String[] args) {
        var crane = new Crane(4, "Cammy");
        System.out.println(crane.numberEggs);
        System.out.println(crane.name);
        System.out.println(crane.name()); //Accessor method = field()
        System.out.println(crane.numberEggs());
        System.out.println(crane.hashCode());

        var copy = new Crane(4, "Cammy");
        System.out.println(copy.hashCode());

        var other = new Crane(5, "Rarara");
        System.out.println(other.hashCode());

        System.out.println(crane.equals(copy));
        System.out.println(crane.equals(other));
    }
}

