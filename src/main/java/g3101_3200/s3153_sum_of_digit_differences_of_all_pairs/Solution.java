package g3101_3200.s3153_sum_of_digit_differences_of_all_pairs;

// #Medium #Array #Hash_Table #Math #Counting #2024_05_22_Time_12_ms_(100.00%)_Space_62.8_MB_(6.25%)

public class Solution {
    public long sumDigitDifferences(int[] nums) { // [1,2,12]
        long result = 0;
        while (nums[0] > 0) { // 13
            int[] counts = new int[10]; // [0,0,0,2,0,0,0,0,0,0]
            for (int i = 0; i < nums.length; i++) { // 12
                int digit = nums[i] % 10; // 2
                nums[i] = nums[i] / 10; // 1
                result += i - counts[digit];
                counts[digit]++;
            }
        }
        return result;
    }
}
