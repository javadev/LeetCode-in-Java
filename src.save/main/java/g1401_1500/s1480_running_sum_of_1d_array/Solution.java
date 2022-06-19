package g1401_1500.s1480_running_sum_of_1d_array;

// #Easy #Array #Prefix_Sum #Level_1_Day_1_Prefix_Sum
// #2022_04_04_Time_0_ms_(100.00%)_Space_42.9_MB_(76.13%)

public class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }
}
