package week_2.ch7.ex_20_nested_class_inner;
/* 1) INNER CLASS
-> might access all instance variable of the outer class (including private ones)
-> access modifiers/specifiers: private, public, package, protected, abstract, final
INSTANTIATE A INNER CLASS
1st way: from an instance method of the outer clasS only using new InnerClass();
2nd way: from a static context as new OuterClass().new InnerClass()
        outerInstance.new InnerClass();
* */
public class Home {
    private String greeting = "Hello";

    protected class Room{
        public int repeat = 3;
        public void enter(){
            for(int i = 0; i < repeat; i++){
                System.out.println(greeting);
            }
        }
    }
    public void enterRoom(){
        Room room = new Room();
        room.enter();
    }
    public static void main(String[] args) {
//        Home home = new Home();
//        home.enterRoom();
        Room room = new Home().new Room();
        room.enter();
    }

}
