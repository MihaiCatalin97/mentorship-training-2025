package week_2.ch7.ex_21_nested_class_static;

public class Emu {
    String name ="Emmy";
    static Feather create(String color){
        return new Feather("grey");
    }
    record Feather(String color){
        void fly(){
            //the following won t compile as record are implicit static
            // implying it can t access instance fields
            // System.out.println(name);
        }
    }
//    class Feather{ <- this won t compile due to a different reason
//                      create method is static - can t access this instance class
//        void fly(){
//            System.out.println(name);
//            //compared to an inner class that is allowed to access instance variable
//        }
//    }
}
