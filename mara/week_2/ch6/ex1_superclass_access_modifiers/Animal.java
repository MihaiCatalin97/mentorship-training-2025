package week_2.ch6.ex1_superclass_access_modifiers;
/* Discussing access modifiers on >> classes <<
 * you can have as many classes (in any order) with package access as you want
 * at most one with public <- this will be the top level class / name of the file
 * however, we can t apply protected or private to a top level class(!the one named as the file)
 * public class Animal { ok }
 * class Animal { ok }
 * protected class Animal { not ok }
 * private class Animal { not ok }
 * AGAIN - for the top level class - the last 2 will be ok when learning nested classes
 * */
public class Animal {
    private int age;
    protected String name;
    String defaultField;
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
