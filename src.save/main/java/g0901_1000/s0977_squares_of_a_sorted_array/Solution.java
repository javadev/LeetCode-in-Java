package g0901_1000.s0977_squares_of_a_sorted_array;

// #Easy #Array #Sorting #Two_Pointers #Algorithm_I_Day_2_Two_Pointers #Udemy_Two_Pointers
// #2022_03_31_Time_1_ms_(100.00%)_Space_44.1_MB_(84.57%)

public class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int[] res = new int[nums.length];
        // Iterate res from back to front. put the bigger of abs(l) * abs(l) and abs(r) * abs(r) at
        // res[i] and increment respectively
        for (int i = nums.length - 1; i >= 0; i--) {
            // If the negative is larger, put it at the end and increment left ptr to next lower
            // negative
            if (Math.abs(nums[l]) > nums[r]) {
                res[i] = nums[l] * nums[l];
                l++;
            } else {
                res[i] = nums[r] * nums[r];
                r--;
            }
        }
        return res;
    }
}
