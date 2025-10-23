package week_2.ch6.ex7_access_parent_constructor;

public class Gorilla extends Animal {
    public Gorilla(int age) {
        super(age, "Gorilla"); //calls the first Animal constructor
    }

    public Gorilla() {
        super(5);//calls the second Animal constructor
    }
    /*what is interesting here is that the super() signature can be different that this()
    meaning that having a Gorilla(int) constructor you can call whatever constructor from super class
    not particularly super(int)
    book> The child constructors are not required to call matching parent constructors
    Any valid parent constructor is acceptable as long as it is accessible and the appropriate
    input parameters to the parent constructor are provided.
    */
}