package g1001_1100.s1004_max_consecutive_ones_iii;

// #Medium #Array #Binary_Search #Prefix_Sum #Sliding_Window
// #2022_02_27_Time_3_ms_(79.01%)_Space_68.2_MB_(65.91%)

public class Solution {
    public int longestOnes(int[] a, int k) {
        int result = 0;
        int i = 0;
        for (int j = 0; j < a.length; j++) {
            if (a[j] == 0) {
                k--;
            }
            while (k < 0) {
                if (a[i] == 0) {
                    k++;
                }
                i++;
            }
            result = Math.max(result, j - i + 1);
        }
        return result;
    }
}
