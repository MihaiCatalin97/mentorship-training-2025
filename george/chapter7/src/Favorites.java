public class Favorites {
   enum Flavors {
       VANILLA, CHOCOLATE, STRAWBERRY; // ; needed
     private Flavors() {} //must be private not public
  }
   public static void main(String[] args) {
        for(final var e : Flavors.values())
                     System.out.print((e.ordinal() % 2) + " ");
        } }