package week_2.ch6.ex17_defensive_copy_rule5;

import java.util.ArrayList;

public final class Animal {
    private final ArrayList<String> favoriteFoods;
    public Animal(ArrayList<String> favoriteFoods) {
        if (favoriteFoods == null || favoriteFoods.size() == 0) {
            throw new IllegalArgumentException("favoriteFoods cannot be null or empty");
        }

        // this.favoriteFoods = favoriteFoods; //rule 5 broken
        this.favoriteFoods = new ArrayList<>(favoriteFoods);//defensive copy
        //the idea is the following - lets suppose i edit in main() the constructor param
        //it will be reflected in favoriteFoods to if i don t create a copy
    }
    public int getFavoriteFoodsSize() {
        return favoriteFoods.size();
    }
    public String getFavoriteFoodItem(int index) {
        return favoriteFoods.get(index);
    }
}
