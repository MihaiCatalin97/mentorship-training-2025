package week_2.ch6.ex16_immutable_objects_rule4;

import java.util.ArrayList;

public final class Animal {
    private final ArrayList<String> favoriteFoods;
    public Animal(){
        favoriteFoods = new ArrayList<String>();
        this.favoriteFoods.add("Crispy");
    }
    //rule 4 broken
    /*public List<String> getFavoriteFoods(){
        return favoriteFoods;
    }*/
    // the data is still available
    // however, the mutable variable cannot be modified by the caller
    public int getFavoriteFoodsSize(){
        return favoriteFoods.size();
    }
    public String getFavoriteFoodItem(int index){
        return favoriteFoods.get(index);
    }
}
