package week_2.ch6.ex12_method_and_variable_hiding;

class Carnivore {
    protected boolean hasFur=false;
}
public class Meerkat extends Carnivore{
    protected boolean hasFur=true;

    public static void main(String[] args) {
        Meerkat m = new Meerkat();
        Carnivore c = m;
        System.out.println(m.hasFur);
        System.out.println(c.hasFur);
    }
}