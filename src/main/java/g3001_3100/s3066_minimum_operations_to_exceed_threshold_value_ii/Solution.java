package g3001_3100.s3066_minimum_operations_to_exceed_threshold_value_ii;

// #Medium #Array #Heap_Priority_Queue #Simulation
// #2024_03_31_Time_26_ms_(99.91%)_Space_65.7_MB_(97.28%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        int steps = 0;
        Arrays.sort(nums);
        List<Integer> extra = new ArrayList<>();
        int i = 0;
        int j = 0;
        while ((i < n && nums[i] < k) || (j < extra.size() && extra.get(j) < k)) {
            int min;
            int max;
            if (i < n && (j >= extra.size() || extra.get(j) > nums[i])) {
                min = nums[i++];
            } else {
                min = extra.get(j++);
            }
            if (i < n && (j >= extra.size() || extra.get(j) > nums[i])) {
                max = nums[i++];
            } else {
                max = extra.get(j++);
            }
            steps++;
            long res = min;
            res = 2 * res + max;
            if (res > Integer.MAX_VALUE) {
                extra.add(Integer.MAX_VALUE);
            } else {
                extra.add((int) res);
            }
        }
        return steps;
    }
}
