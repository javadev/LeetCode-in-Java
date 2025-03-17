package g3401_3500.s3488_closest_equal_element_queries;

// #Medium #Array #Hash_Table #Binary_Search
// #2025_03_17_Time_50_ms_(100.00%)_Space_74.96_MB_(100.00%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int sz = nums.length;
        Map<Integer, List<Integer>> indices = new HashMap<>();
        for (int i = 0; i < sz; i++) {
            indices.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        for (List<Integer> arr : indices.values()) {
            int m = arr.size();
            if (m == 1) {
                nums[arr.get(0)] = -1;
                continue;
            }
            for (int i = 0; i < m; i++) {
                int j = arr.get(i);
                int f = arr.get((i + 1) % m);
                int b = arr.get((i - 1 + m) % m);
                int forward = Math.min((sz - j - 1) + f + 1, Math.abs(j - f));
                int backward = Math.min(Math.abs(b - j), j + (sz - b));
                nums[j] = Math.min(backward, forward);
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int q : queries) {
            res.add(nums[q]);
        }
        return res;
    }
}
