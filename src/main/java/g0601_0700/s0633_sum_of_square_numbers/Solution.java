package g0601_0700.s0633_sum_of_square_numbers;

// #Medium #Math #Binary_Search #Two_Pointers

public class Solution {
    public boolean judgeSquareSum(int c) {
        int right = (int) Math.sqrt(c);
        int left = (int) Math.sqrt((int) (c / 2));
        for (int i = left; i <= right; i++) {
            int j = (int) Math.sqrt(c - i * i);
            if (i * i + j * j == c) {
                return true;
            }
        }
        return false;
    }
}
