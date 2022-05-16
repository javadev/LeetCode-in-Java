package g1901_2000.s1929_concatenation_of_array;

// #Easy #Array #2022_05_15_Time_1_ms_(92.52%)_Space_42.9_MB_(80.72%)

public class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        System.arraycopy(nums, 0, result, 0, nums.length);
        int i = nums.length;
        for (int j = 0; i < result.length && j < nums.length; i++, j++) {
            result[i] = nums[j];
        }
        return result;
    }
}
