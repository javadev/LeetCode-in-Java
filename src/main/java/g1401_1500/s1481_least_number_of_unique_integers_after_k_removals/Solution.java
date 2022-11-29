package g1401_1500.s1481_least_number_of_unique_integers_after_k_removals;

// #Medium #Array #Hash_Table #Sorting #Greedy #Counting
// #2022_04_05_Time_62_ms_(85.33%)_Space_80.4_MB_(77.11%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int a : arr) {
            count.put(a, 1 + count.getOrDefault(a, 0));
        }
        int remaining = count.size();
        int occur = 1;
        int[] occurrenceCount = new int[arr.length + 1];

        for (int v : count.values()) {
            ++occurrenceCount[v];
        }
        while (k > 0) {
            if (k - occur * occurrenceCount[occur] >= 0) {
                k -= occur * occurrenceCount[occur];
                remaining -= occurrenceCount[occur++];
            } else {
                return remaining - k / occur;
            }
        }
        return remaining;
    }
}
