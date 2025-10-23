package week_2.ch6.ex14_abstract_classes;

public class FennecFox extends Canine{
    /* should respect the override methods rules- the following won t compile as
    the return types are not covariant (r4)*/
    /*
      public int getSound(){
         return 0;
    } */
    public String getSound(){
        return null;
    }
    /*also it should implement all the abstract methods inherited
    * if the body was empty - again - won t compile */
}
