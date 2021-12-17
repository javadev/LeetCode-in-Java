package g0301_0400.s0380_insert_delete_getrandom_o1;

// #Medium #Top_Interview_Questions #Array #Hash_Table #Math #Design #Randomized

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RandomizedSet {
    private final SecureRandom rand;
    private final List<Integer> list;
    private final Map<Integer, Integer> map;

    // Initialize your data structure here.
    public RandomizedSet() {
        this.rand = new SecureRandom();
        this.list = new ArrayList<>();
        this.map = new HashMap<>();
    }

    // Inserts a value to the set. Returns true if the set did not already contain the specified
    // element.

    public boolean insert(int val) {
        if (this.map.containsKey(val)) {
            return false;
        }
        this.list.add(val);
        this.map.put(val, list.size() - 1);
        return true;
    }

    // Removes a value from the set. Returns true if the set contained the specified element.
    public boolean remove(int val) {
        if (!this.map.containsKey(val)) {
            return false;
        }
        int index = this.map.get(val);
        if (index == this.list.size() - 1) {
            this.list.remove(index);
            this.map.remove(val);
            return true;
        }
        int value = list.get(list.size() - 1);
        this.list.set(index, value);
        this.list.remove(this.list.size() - 1);
        this.map.remove(val);
        this.map.put(value, index);
        return true;
    }

    // Get a random element from the set.
    public int getRandom() {
        return this.list.get(rand.nextInt(list.size()));
    }
}

/*
 * Your RandomizedSet object will be instantiated and called as such: RandomizedSet obj = new
 * RandomizedSet(); boolean param_1 = obj.insert(val); boolean param_2 = obj.remove(val); int
 * param_3 = obj.getRandom();
 */
