package g3401_3500.s3452_sum_of_good_numbers;

// #Easy #2025_02_16_Time_1_ms_(100.00%)_Space_44.30_MB_(100.00%)

public class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int totalSum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean isGood = true;
            if (i - k >= 0) {
                if (nums[i] <= nums[i - k]) {
                    isGood = false;
                }
            }
            if (i + k < n) {
                if (nums[i] <= nums[i + k]) {
                    isGood = false;
                }
            }
            if (isGood) {
                totalSum += nums[i];
            }
        }
        return totalSum;
    }
}
