package g0201_0300.s0283_move_zeroes;

public class Solution {
    public void moveZeroes(int[] nums) {
        int first_zero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(first_zero, i, nums);
                first_zero++;
            }
        }
    }

    private void swap(int index1, int index2, int[] numbers) {
        int val_2 = numbers[index2];
        numbers[index2] = numbers[index1];
        numbers[index1] = val_2;
    }
}
