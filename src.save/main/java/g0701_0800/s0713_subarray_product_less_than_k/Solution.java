package g0701_0800.s0713_subarray_product_less_than_k;

// #Medium #Array #Sliding_Window #Algorithm_II_Day_5_Sliding_Window #Programming_Skills_II_Day_12
// #Udemy_Arrays #2022_03_24_Time_8_ms_(39.00%)_Space_67_MB_(75.58%)

public class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int p = 1;
        int j = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            p = p * nums[i];
            while (p >= k && j < i) {
                p = p / nums[j];
                j++;
            }
            ans += p < k ? i - j + 1 : 0;
        }
        return ans;
    }
}
