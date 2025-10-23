package week_2.ch6.ex8_initializing_final_fields;
/*
any instance variables marked final. Make sure they are assigned a value in the line where
they are declared, in an instance initializer, or in a constructor
*/
public class MouseHouse {
    private final int volume;
    private final String type;
    {
        this.volume = 100;
    }
    public MouseHouse(String type) {
        this.type = type;
    }
//    public MouseHouse(int volume) { Won t compile as the value will be assigned twice
//     ++the constructor fails to set a value for the type variable
//        this.volume = 2;
//    }
}
