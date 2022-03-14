package g0201_0300.s0238_product_of_array_except_self;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Prefix_Sum
// #Data_Structure_II_Day_5_Array #2022_03_14_Time_1_ms_(100.00%)_Space_50_MB_(94.82%)

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            product = product * nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                ans[i] = product / nums[i];
            } else {
                int p = 1;
                for (int j = 0; j < nums.length; j++) {
                    if (j != i) {
                        p = p * nums[j];
                    }
                }
                ans[i] = p;
            }
        }
        return ans;
    }
}
