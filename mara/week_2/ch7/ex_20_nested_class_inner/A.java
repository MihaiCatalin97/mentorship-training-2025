package week_2.ch7.ex_20_nested_class_inner;
//Discussing duplicated variable names
// as an inner class might declare the same variable as the outer class and it would compile
// access allowed by Outer.this.variableName
public class A {
    private int x = 10;
    class B{
        private int x = 100;
        class C {
            private int x = 1000;
            public void printAllX()
            {
                System.out.println(x); // 1000
                System.out.println(this.x); //1000
                System.out.println(C.this.x);//1000
                System.out.println(B.this.x);//100
                System.out.println(A.this.x);//10

            }
        }
    }
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();
        //A.B.C c = new A().new B(). new C();
        c.printAllX();
    }
}
