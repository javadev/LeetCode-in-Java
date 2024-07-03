package g0101_0200.s0152_maximum_product_subarray;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Dynamic_Programming
// #Dynamic_Programming_I_Day_6 #Level_2_Day_13_Dynamic_Programming #Udemy_Dynamic_Programming
// #Big_O_Time_O(N)_Space_O(1) #2024_07_03_Time_1_ms_(92.31%)_Space_44.6_MB_(75.65%)

public class Solution {
    public int maxProduct(int[] nums) {
        int currentMaxProd = nums[0];
        int currentMinProd = nums[0];
        int overAllMaxProd = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = currentMaxProd;
                currentMaxProd = currentMinProd;
                currentMinProd = temp;
            }
            currentMaxProd = Math.max(nums[i], nums[i] * currentMaxProd);
            currentMinProd = Math.min(nums[i], nums[i] * currentMinProd);
            overAllMaxProd = Math.max(overAllMaxProd, currentMaxProd);
        }
        return overAllMaxProd;
    }
}
