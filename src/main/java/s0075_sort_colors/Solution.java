package s0075_sort_colors;

public class Solution {
    public void sortColors(int[] nums) {
        int zeroes = 0;
        int ones = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[zeroes++] = 0;
            } else if (nums[i] == 1) {
                ones++;
            }
        }
        for (int j = zeroes; j < zeroes + ones; j++) {
            nums[j] = 1;
        }
        for (int k = zeroes + ones; k < nums.length; k++) {
            nums[k] = 2;
        }
    }
}
