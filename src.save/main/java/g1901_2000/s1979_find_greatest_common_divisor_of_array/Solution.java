package g1901_2000.s1979_find_greatest_common_divisor_of_array;

// #Easy #Array #Math #Number_Theory #2022_05_21_Time_5_ms_(10.46%)_Space_43.6_MB_(61.12%)

import java.util.Arrays;

public class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return getGcd(nums[0], nums[nums.length - 1]);
    }

    private int getGcd(int a, int b) {
        return b == 0 ? a : getGcd(b, a % b);
    }
}
