package week_2.ch7.ex03_multiple_interface_conflicting_methods;

public interface Herbivore {
    public int eatPlants(int plantsLeft);
    //the following would cause compile error due to incompatible return types void/int
    //public void eatPlants(int plantsLeft);

}
