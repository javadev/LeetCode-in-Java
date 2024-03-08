package g2901_3000.s2966_divide_array_into_arrays_with_max_difference;

// #Medium #Array #Sorting #Greedy #2024_01_16_Time_20_ms_(99.04%)_Space_59.4_MB_(10.50%)

import java.util.Arrays;

public class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int triplets = n / 3;
        int[][] result = new int[triplets][];
        for (int i = 0, j = 0; i < n; i += 3, j++) {
            int first = nums[i];
            int third = nums[i + 2];
            if (third - first > k) {
                return new int[0][];
            }
            result[j] = new int[] {first, nums[i + 1], third};
        }
        return result;
    }
}
