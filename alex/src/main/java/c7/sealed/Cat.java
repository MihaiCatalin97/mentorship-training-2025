package c7.sealed;

public non-sealed class Cat extends Animal {
    public String type;
    public int years;
    public Cat(String type, int years) {
        super("British",4);
        System.out.println("Cat");
    }
    @Override
    public void eat() {
        System.out.println("Cat");
    }
}
