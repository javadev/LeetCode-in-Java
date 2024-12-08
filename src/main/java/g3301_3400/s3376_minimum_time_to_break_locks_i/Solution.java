package g3301_3400.s3376_minimum_time_to_break_locks_i;

// #Medium #2024_12_07_Time_760_ms_(100.00%)_Space_45_MB_(100.00%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int findMinimumTime(List<Integer> strength, int k) {
        List<Integer> perm = new ArrayList<>(strength);
        Collections.sort(perm);
        int minTime = Integer.MAX_VALUE;
        do {
            int time = 0;
            int factor = 1;
            for (int required : perm) {
                int neededTime = (required + factor - 1) / factor;
                time += neededTime;
                factor += k;
            }
            minTime = Math.min(minTime, time);
        } while (nextPermutation(perm));
        return minTime;
    }

    private boolean nextPermutation(List<Integer> nums) {
        int i = nums.size() - 2;
        while (i >= 0 && nums.get(i) >= nums.get(i + 1)) {
            i--;
        }
        if (i < 0) {
            return false;
        }
        int j = nums.size() - 1;
        while (nums.get(j) <= nums.get(i)) {
            j--;
        }
        Collections.swap(nums, i, j);
        Collections.reverse(nums.subList(i + 1, nums.size()));
        return true;
    }
}
