package g3201_3300.s3255_find_the_power_of_k_size_subarrays_ii;

// #Medium #Array #Sliding_Window #2024_08_20_Time_3_ms_(99.24%)_Space_64.1_MB_(67.44%)

public class Solution {
    public int[] resultsArray(int[] nums, int k) {
        if (k == 1) {
            return nums;
        }
        int start = 0;
        int n = nums.length;
        int[] output = new int[n - k + 1];
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                start = i;
            }
            int index = i - k + 1;
            if (index >= 0) {
                if (start > index) {
                    output[index] = -1;
                } else {
                    output[index] = nums[i];
                }
            }
        }
        return output;
    }
}
