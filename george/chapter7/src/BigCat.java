public interface BigCat {
    abstract String getName();
  //  static int hunt() { getName(); return 5; } cannot be used in static context
    default void climb() { rest(); }
  //   private void roar() { getName();  climb(); hunt(); }
  //  private static boolean sneak() { roar(); return true; } cant access private from static
    private int rest() { return 2; };
 }