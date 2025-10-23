package week_2.ch6.ex2_hiding_a_variable;

public class Crocodile extends Reptile{
    protected int speed = 20;//hiding the variable
    public int getSpeed() {
        return speed;
    }
    public int getSuperClassSpeed() {
        return super.speed;//however, the parent variable is still available using super
    }
    public static void main(String[] args){
        var crocodile=new Crocodile();
        System.out.println("Main Speed "+crocodile.getSpeed());
        System.out.println("Super Speed "+crocodile.getSuperClassSpeed());
    }
}
