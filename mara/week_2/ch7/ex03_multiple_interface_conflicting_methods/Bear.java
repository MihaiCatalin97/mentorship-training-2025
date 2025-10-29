package week_2.ch7.ex03_multiple_interface_conflicting_methods;

//we notice that both Herbiover & Omnivore interfaces
//contain a method named eatPlants
//due to the fact that in this class we define its body
//the conflict is solved
//However, this happens because they are compatible
public class Bear implements Herbivore, Omnivore {
    public int eatPlants(int foodRemaining) {
        System.out.println("Eating plants");
        return foodRemaining + 10;
    }
}
