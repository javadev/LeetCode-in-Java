package g0001_0100.s0089_gray_code_medium_math_bit_manipulation_backtracking;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> grayCode(int n) {
        Integer[] n1 = {0};
        int shift = 1;
        while (n > 0) {
            Integer[] temp = new Integer[n1.length * 2];
            int pos = 0;
            for (int i = 0; i < n1.length; i++) {
                temp[pos++] = n1[i];
            }
            for (int i = n1.length - 1; i >= 0; i--) {
                temp[pos++] = n1[i] | shift;
            }
            n1 = temp;
            shift <<= 1;
            n--;
        }
        return Arrays.asList(n1);
    }
}
