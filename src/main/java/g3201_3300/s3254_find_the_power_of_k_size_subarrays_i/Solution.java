package g3201_3300.s3254_find_the_power_of_k_size_subarrays_i;

// #Medium #Array #Sliding_Window #2024_08_20_Time_1_ms_(100.00%)_Space_45.2_MB_(95.96%)

public class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n - k + 1];
        int count = 0;
        for (int i = 1; i < k; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                count++;
            }
        }
        arr[0] = (count == k - 1) ? nums[k - 1] : -1;
        for (int i = 1; i <= n - k; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                count--;
            }
            if (nums[i + k - 1] == nums[i + k - 2] + 1) {
                count++;
            }
            arr[i] = (count == k - 1) ? nums[i + k - 1] : -1;
        }
        return arr;
    }
}
