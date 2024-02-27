package g3001_3100.s3010_divide_an_array_into_subarrays_with_minimum_cost_i;

// #Easy #Array #Sorting #Enumeration #2024_02_27_Time_1_ms_(99.09%)_Space_43.6_MB_(96.36%)

public class Solution {
    public int minimumCost(int[] nums) {
        int first = nums[0];
        int min = 51;
        int secMin = 52;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                secMin = min;
                min = nums[i];
            } else if (nums[i] < secMin) {
                secMin = nums[i];
            }
        }
        return first + min + secMin;
    }
}
