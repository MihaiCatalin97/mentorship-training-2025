package week_2.ch6.ex1_superclass_access_modifiers;
/* Discussing access modifiers on >>> members <<<
* a subclass has access to all public & protected members of a superclass
* if they are both in the same package - then it would inherit the package members too
* however, it is not allowed to access private modifiers
* */
public class Lion extends Animal {
    protected void setProperties(int age, String name) {
        this.name = name;
        this.defaultField = "using package access modifier";
        setAge(age);
    }

    public void roar() {
        System.out.println(name + " age " + getAge() + "roarr and off topic>" + defaultField);
    }
    public static void main(String[] args) {
        var lion=new Lion();
        lion.setProperties(3,"Simba");
        lion.roar();
    }
}
