package g3101_3200.s3153_sum_of_digit_differences_of_all_pairs;

// #Medium #Array #Hash_Table #Math #Counting #2024_05_22_Time_12_ms_(100.00%)_Space_62.8_MB_(6.25%)

public class Solution {
    public long sumDigitDifferences(int[] nums) {
        long result = 0;
        while (nums[0] > 0) {
            int[] counts = new int[10];
            for (int i = 0; i < nums.length; i++) {
                int digit = nums[i] % 10;
                nums[i] = nums[i] / 10;
                result += i - counts[digit];
                counts[digit]++;
            }
        }
        return result;
    }
}
