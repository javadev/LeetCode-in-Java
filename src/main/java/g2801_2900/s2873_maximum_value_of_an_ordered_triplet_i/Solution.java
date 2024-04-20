package g2801_2900.s2873_maximum_value_of_an_ordered_triplet_i;

// #Easy #Array #2023_12_21_Time_0_ms_(100.00%)_Space_42_MB_(10.64%)

public class Solution {
    public long maximumTripletValue(int[] nums) {
        final int n = nums.length;
        final int[] iNumMaxs = new int[n];
        int prev = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= prev) {
                iNumMaxs[i] = prev;
            } else {
                prev = iNumMaxs[i] = nums[i];
            }
        }
        long result = 0;
        int kNumMax = nums[n - 1];
        for (int j = n - 2; j > 0; j--) {
            result = Math.max(result, (long) (iNumMaxs[j - 1] - nums[j]) * kNumMax);
            if (nums[j] > kNumMax) {
                kNumMax = nums[j];
            }
        }
        return result;
    }
}
