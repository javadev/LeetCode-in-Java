package g2601_2700.s2681_power_of_heroes;

// #Hard #Array #Math #Sorting #Prefix_Sum #2023_09_11_Time_13_ms_(88.24%)_Space_54.4_MB_(55.29%)

import java.util.Arrays;

public class Solution {
    public int sumOfPower(int[] nums) {
        Arrays.sort(nums);
        long sumOfMin = 0L;
        long res = 0L;
        for (int num : nums) {
            long mod = 1_000_000_007L;
            long max = (long) num * num % mod;
            long mySumOfMin = (sumOfMin + num) % mod;
            res = (res + max * mySumOfMin) % mod;
            sumOfMin = (sumOfMin + mySumOfMin) % mod;
        }
        return (int) res;
    }
}
