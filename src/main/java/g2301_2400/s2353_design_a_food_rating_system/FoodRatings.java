package g2301_2400.s2353_design_a_food_rating_system;

// #Medium #Hash_Table #Design #Heap_Priority_Queue #Ordered_Set
// #2022_08_07_Time_364_ms_(83.35%)_Space_174.6_MB_(23.97%)

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class FoodRatings {
    private HashMap<String, TreeSet<Food>> cus = new HashMap<>();
    private HashMap<String, Food> foodHashMap = new HashMap<>();

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for (int i = 0; i < foods.length; i++) {
            Food food = new Food(foods[i], ratings[i], cuisines[i]);
            foodHashMap.put(foods[i], food);
            if (cus.containsKey(cuisines[i])) {
                cus.get(cuisines[i]).add(food);
            } else {
                TreeSet<Food> pq = new TreeSet<>(new Comp());
                pq.add(food);
                cus.put(cuisines[i], pq);
            }
        }
    }

    public void changeRating(String food, int newRating) {
        Food dish = foodHashMap.get(food);
        TreeSet<Food> pq = cus.get(dish.cus);
        pq.remove(dish);
        dish.rating = newRating;
        pq.add(dish);
    }

    public String highestRated(String cuisine) {
        return cus.get(cuisine).first().foodItem;
    }

    private static class Comp implements Comparator<Food> {
        public int compare(Food f1, Food f2) {
            if (f1.rating == f2.rating) {
                return f1.foodItem.compareTo(f2.foodItem);
            }
            return Integer.compare(f2.rating, f1.rating);
        }
    }

    private static class Food {
        private String foodItem;
        private String cus;
        private int rating;

        Food(String food, int rating, String cus) {
            this.foodItem = food;
            this.rating = rating;
            this.cus = cus;
        }
    }
}

/*
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */
