package c7.sealed;

public sealed class Animal permits Dog,Cat{

    public String type;
    public int years;
    //Animal(){}
    public Animal(String type, int years){
        this.type = type;
        this.years = years;
    }
    public void  eat(){
        System.out.println("Animal");
    }
}
