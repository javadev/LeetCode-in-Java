package g0301_0400.s0380_insert_delete_getrandom_o1;

// #Medium #Array #Hash_Table #Math #Design #Randomized #Programming_Skills_II_Day_20
// #2022_07_13_Time_27_ms_(93.44%)_Space_92.2_MB_(91.11%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@SuppressWarnings("java:S2245")
public class RandomizedSet {
    private final Random rand;
    private final List<Integer> list;
    private final Map<Integer, Integer> map;

    /* Initialize your data structure here. */
    public RandomizedSet() {
        this.rand = new Random();
        this.list = new ArrayList<>();
        this.map = new HashMap<>();
    }

    /* Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, list.size());
        list.add(val);

        return true;
    }

    /* Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int swap1 = map.get(val);
        int swap2 = list.size() - 1;
        int val2 = list.get(swap2);
        map.put(val2, swap1);
        map.remove(val);
        list.set(swap1, val2);
        list.remove(list.size() - 1);
        return true;
    }

    /* Get a random element from the set. */
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

/*
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
