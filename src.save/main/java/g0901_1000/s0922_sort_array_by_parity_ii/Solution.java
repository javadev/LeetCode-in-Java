package g0901_1000.s0922_sort_array_by_parity_ii;

// #Easy #Array #Sorting #Two_Pointers #2022_03_29_Time_4_ms_(52.95%)_Space_55.6_MB_(17.78%)

public class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0;
        int j = 1;
        while (i < nums.length - 1 && j < nums.length) {
            if (nums[i] % 2 != 0 && nums[j] % 2 == 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                i += 2;
                j += 2;
            }
            while (i < nums.length - 1 && nums[i] % 2 == 0) {
                i += 2;
            }
            while (j < nums.length && nums[j] % 2 != 0) {
                j += 2;
            }
        }
        return nums;
    }
}
