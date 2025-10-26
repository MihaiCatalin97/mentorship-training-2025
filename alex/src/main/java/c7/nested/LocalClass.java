package c7.nested;

public class LocalClass {
    private int x = 2;
    public void calculator()
    {
        final int y = 7;
        class Calc{
            public void addition()
            {
                System.out.println(x + y);
            }
        }
        var calc = new Calc();
        calc.addition();
    }

    public static void main(String[] args) {
        LocalClass c = new LocalClass();
        c.calculator();
    }
}
