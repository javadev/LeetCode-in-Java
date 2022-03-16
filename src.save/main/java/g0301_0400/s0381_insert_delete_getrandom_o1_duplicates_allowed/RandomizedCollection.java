package g0301_0400.s0381_insert_delete_getrandom_o1_duplicates_allowed;

// #Hard #Array #Hash_Table #Math #Design #Randomized
// #2022_03_16_Time_141_ms_(5.09%)_Space_97.1_MB_(51.88%)

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("java:S3824")
public class RandomizedCollection {
    private HashMap<Integer, HashSet<Integer>> hashMap;
    private int[] arr;
    private int size;
    private SecureRandom rand;

    public RandomizedCollection() {
        hashMap = new HashMap<>();
        size = 0;
        arr = new int[200000];
        rand = new SecureRandom();
    }

    public boolean insert(int val) {
        boolean exists = true;
        if (!hashMap.containsKey(val)) {
            exists = false;
            hashMap.put(val, new HashSet<>());
        }
        hashMap.get(val).add(size);
        arr[size] = val;
        size++;
        return !exists;
    }

    public boolean remove(int val) {
        if (!hashMap.containsKey(val)) {
            return false;
        }
        int idx = hashMap.get(val).iterator().next();
        int lastVal = arr[size - 1];
        if (lastVal != val) {
            hashMap.get(lastVal).add(idx);
            hashMap.get(val).remove(idx);
        }
        hashMap.get(lastVal).remove(size - 1);
        arr[idx] = lastVal;
        if (hashMap.get(val).isEmpty()) {
            hashMap.remove(val);
        }
        size--;
        return true;
    }

    public int getRandom() {
        int idx = rand.nextInt(size);
        return arr[idx];
    }
}
