package g3001_3100.s3012_minimize_length_of_array_using_operations;

// #Medium #Array #Math #Greedy #Number_Theory #2024_02_27_Time_2_ms_(96.82%)_Space_58.5_MB_(74.97%)

public class Solution {
    public int minimumArrayLength(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int i : nums) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        int n = nums.length;
        if (n == 1) {
            return 1;
        }
        if (max % min != 0) {
            return 1;
        }
        int count = 0;
        for (int i : nums) {
            if (i % min != 0 && i % min < min) {
                return 1;
            }
            if (i == min) {
                count++;
            }
        }
        return (count + 1) / 2;
    }
}
