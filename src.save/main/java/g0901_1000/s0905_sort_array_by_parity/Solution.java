package g0901_1000.s0905_sort_array_by_parity;

// #Easy #Array #Sorting #Two_Pointers #2022_03_28_Time_1_ms_(95.51%)_Space_48.4_MB_(46.34%)

public class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int temp;
        int i = 0;
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] % 2 == 0) {
                temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                i++;
            }
        }
        return nums;
    }
}
