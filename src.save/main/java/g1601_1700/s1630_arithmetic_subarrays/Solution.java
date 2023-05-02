package g1601_1700.s1630_arithmetic_subarrays;

// #Medium #Array #Sorting #Programming_Skills_II_Day_9
// #2022_04_19_Time_8_ms_(93.62%)_Space_54.4_MB_(59.83%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList<>();
        int n = l.length;
        for (int i = 0; i < n; i++) {
            result.add(check(nums, l[i], r[i]));
        }
        return result;
    }

    private boolean check(int[] nums, int l, int r) {
        int n = r - l;
        if (n == 0) {
            return true;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = l; i <= r; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        if ((max - min) % n != 0) {
            return false;
        }
        int diff = (max - min) / n;
        if (diff == 0) {
            return true;
        }
        boolean[] checked = new boolean[max - min + 1];
        for (int i = l; i <= r; i++) {
            int currentDiff = nums[i] - min;
            if (checked[currentDiff] || currentDiff % diff != 0) {
                return false;
            }
            checked[currentDiff] = true;
        }
        return true;
    }
}
