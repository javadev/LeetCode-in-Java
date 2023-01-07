package g0401_0500.s0414_third_maximum_number;

// #Easy #Array #Sorting #2022_07_16_Time_1_ms_(97.59%)_Space_41.9_MB_(92.80%)

public class Solution {
    public int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        for (int i : nums) {
            max1 = Math.max(max1, i);
        }
        for (int i : nums) {
            if (i == max1) {
                continue;
            }
            max2 = Math.max(max2, i);
        }
        for (int i : nums) {
            if (i == max1 || i == max2) {
                continue;
            }
            max3 = Math.max(max3, i);
        }
        return (int) (max3 == Long.MIN_VALUE ? max1 : max3);
    }
}
