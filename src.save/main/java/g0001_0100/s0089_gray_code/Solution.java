package g0001_0100.s0089_gray_code;

// #Medium #Math #Bit_Manipulation #Backtracking
// #2022_02_21_Time_2_ms_(99.93%)_Space_47.3_MB_(80.24%)

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
