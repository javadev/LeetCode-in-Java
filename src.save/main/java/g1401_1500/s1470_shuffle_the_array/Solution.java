package g1401_1500.s1470_shuffle_the_array;

// #Easy #Array #2022_03_29_Time_1_ms_(51.62%)_Space_45.5_MB_(66.97%)

public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int i = 0;
        int j = 0;
        while (i < n && j < 2 * n) {
            result[j] = nums[i];
            result[++j] = nums[i + n];
            i++;
            j++;
        }
        return result;
    }
}
