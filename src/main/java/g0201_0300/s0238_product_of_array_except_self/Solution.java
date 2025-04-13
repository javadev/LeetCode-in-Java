package g0201_0300.s0238_product_of_array_except_self;

// #Medium #Top_100_Liked_Questions #Array #Prefix_Sum #LeetCode_75_Array/String
// #Data_Structure_II_Day_5_Array #Udemy_Arrays #Top_Interview_150_Array/String
// #Big_O_Time_O(n^2)_Space_O(n) #2024_11_16_Time_1_ms_(99.66%)_Space_55.1_MB_(79.02%)

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int prefixProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            res[i] = prefixProduct;
            prefixProduct *= nums[i];
        }
        int suffixProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }
        return res;
    }
}
