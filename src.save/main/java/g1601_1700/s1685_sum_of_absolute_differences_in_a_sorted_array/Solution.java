package g1601_1700.s1685_sum_of_absolute_differences_in_a_sorted_array;

// #Medium #Array #Math #Prefix_Sum #2022_04_18_Time_4_ms_(80.17%)_Space_58.3_MB_(88.84%)

public class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int len = nums.length;
        int[] preSums = new int[len];
        for (int i = 1; i < len; i++) {
            preSums[i] = preSums[i - 1] + nums[i - 1];
        }
        int[] postSums = new int[len];
        for (int i = len - 2; i >= 0; i--) {
            postSums[i] = postSums[i + 1] + nums[i + 1];
        }
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = nums[i] * i - preSums[i] + postSums[i] - nums[i] * (len - i - 1);
        }
        return result;
    }
}
