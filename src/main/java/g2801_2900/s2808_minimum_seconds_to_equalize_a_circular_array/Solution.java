package g2801_2900.s2808_minimum_seconds_to_equalize_a_circular_array;

// #Medium #Array #Hash_Table #Greedy #2023_09_25_Time_59_ms_(88.86%)_Space_82.4_MB_(29.30%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public int minimumSeconds(List<Integer> nums) {
        int n = nums.size();
        int min = n / 2;
        HashMap<Integer, List<Integer>> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int v = nums.get(i);
            hm.computeIfAbsent(v, k -> new ArrayList<>()).add(i);
        }
        for (List<Integer> list : hm.values()) {
            if (list.size() > 1) {
                int curr = (list.get(0) + n - list.get(list.size() - 1)) / 2;
                for (int i = 1; i < list.size(); i++) {
                    curr = Math.max(curr, (list.get(i) - list.get(i - 1)) / 2);
                }
                min = Math.min(min, curr);
            }
        }
        return min;
    }
}
