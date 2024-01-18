package g2701_2800.s2765_longest_alternating_subarray;

// #Easy #Array #Enumeration #2023_09_24_Time_2_ms_(82.60%)_Space_43_MB_(69.16%)

@SuppressWarnings("java:S135")
public class Solution {
    public int alternatingSubarray(int[] nums) {
        int result = -1;
        int previous = 0;
        int sum = 1;
        for (int i = 1; i < nums.length; i++) {
            int diff = nums[i] - nums[i - 1];
            if (Math.abs(diff) != 1) {
                sum = 1;
                continue;
            }
            if (diff == previous) {
                sum = 2;
            }
            if (diff != previous) {
                if (diff != (sum % 2 == 0 ? -1 : 1)) {
                    continue;
                }
                sum++;
                previous = diff;
            }
            result = Math.max(result, sum);
        }
        return result;
    }
}
