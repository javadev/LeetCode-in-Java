package g3401_3500.s3452_sum_of_good_numbers;

// #Easy #Array #2025_02_18_Time_1_ms_(99.99%)_Space_44.75_MB_(7.31%)

public class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int totalSum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean isGood = i - k < 0 || nums[i] > nums[i - k];
            if (i + k < n && nums[i] <= nums[i + k]) {
                isGood = false;
            }
            if (isGood) {
                totalSum += nums[i];
            }
        }
        return totalSum;
    }
}
