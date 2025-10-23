package week_2.ch6.ex11_initialization_inherit_order;
/*first class initializ: static (superclass-> child)
non-static context: top-down,
main
instance initialization (instance init -> constructor) after child (instance init -> rest constructor)
* */
public class GiraffeFamily {
    static {
        System.out.println("A");
    }
    {
        System.out.println("B");
    }
    public GiraffeFamily(String name) {
        this(1);
        System.out.println("C");
    }
    public GiraffeFamily() {
        System.out.println("D");
    }
    public GiraffeFamily(int stripes) {
        System.out.println("E");
    }
}
