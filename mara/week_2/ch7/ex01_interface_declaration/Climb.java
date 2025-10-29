package week_2.ch7.ex01_interface_declaration;

//the interface cannot be final as its purpose is to be extended
//it cannot be private, nor protected
//it cannot be instantiated
//the methods are optional
interface Climb {
    Number getSpeed(int age);
}
