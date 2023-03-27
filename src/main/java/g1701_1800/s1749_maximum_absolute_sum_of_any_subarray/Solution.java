package g1701_1800.s1749_maximum_absolute_sum_of_any_subarray;

// #Medium #Array #Dynamic_Programming #2022_04_30_Time_3_ms_(90.60%)_Space_65.8_MB_(11.86%)

public class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int min = 0;
        int max = 0;
        int s = 0;
        for (int num : nums) {
            s += num;
            min = Math.min(min, s);
            max = Math.max(max, s);
        }
        return max - min;
    }
}
