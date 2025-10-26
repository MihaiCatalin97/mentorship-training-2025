package c7.nested;

public class Nested1 {
    //de nefolosit in cod pe bune
    private int number = 20;
    class B{
        private int number = 15;
        class C{
            private int number = 10;
            public void show(){
                System.out.println(number);
                System.out.println(this.number);
                System.out.println(B.this.number);
                System.out.println(Nested1.this.number);
            }
        }
    }
    public static void main(String[] args) {
        Nested1 a = new Nested1();
        B b = a.new B();//se putea si A.B
        Nested1.B.C c = b.new C();
        c.show();
    }
}
