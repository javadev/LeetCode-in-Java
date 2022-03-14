package g0201_0300.s0283_move_zeroes;

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Array #Two_Pointers
// #Algorithm_I_Day_3_Two_Pointers #Programming_Skills_I_Day_6_Array
// #2022_03_14_Time_2_ms_(74.00%)_Space_54.7_MB_(38.66%)

public class Solution {
    public void moveZeroes(int[] nums) {
        int firstZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(firstZero, i, nums);
                firstZero++;
            }
        }
    }

    private void swap(int index1, int index2, int[] numbers) {
        int val2 = numbers[index2];
        numbers[index2] = numbers[index1];
        numbers[index1] = val2;
    }
}
