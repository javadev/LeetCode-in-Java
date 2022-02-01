package g0701_0800.s0713_subarray_product_less_than_k;

// #Medium #Array #Sliding_Window

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
