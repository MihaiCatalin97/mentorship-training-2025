package week_2.ch7.ex_25_polymorphism_instanceof;

class Rodent {
}

public class Capybara extends Rodent {
    public static void main(String[] args) {
        Rodent rodent = new Rodent();
        if (rodent instanceof Capybara c) {
            var capybara = (Capybara) rodent;
        }
    }
}

//but again instance of won t compile for explicit  unrelated types
class Fish {
    static void main(String[] args) {
        Fish fish = new Fish();
//        if (fish instanceof Capybara){
//
//        }
    }
}