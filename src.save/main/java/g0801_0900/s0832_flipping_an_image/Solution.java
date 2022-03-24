package g0801_0900.s0832_flipping_an_image;

// #Easy #Array #Matrix #Two_Pointers #Simulation
// #2022_03_24_Time_1_ms_(68.54%)_Space_45_MB_(37.50%)

public class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int m = image.length;
        int n = image[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            int[] flipped = (reverse(image[i]));
            result[i] = invert(flipped);
        }
        return result;
    }

    private int[] invert(int[] flipped) {
        int[] result = new int[flipped.length];
        for (int i = 0; i < flipped.length; i++) {
            if (flipped[i] == 0) {
                result[i] = 1;
            } else {
                result[i] = 0;
            }
        }
        return result;
    }

    private int[] reverse(int[] nums) {
        for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return nums;
    }
}
