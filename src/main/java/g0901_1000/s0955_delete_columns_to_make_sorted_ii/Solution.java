package g0901_1000.s0955_delete_columns_to_make_sorted_ii;

// #Medium #Array #String #Greedy #2022_03_30_Time_2_ms_(68.84%)_Space_42.4_MB_(47.83%)

public class Solution {
    public int minDeletionSize(String[] strs) {
        boolean[] sorted = new boolean[strs.length];
        int res = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            int j = 0;
            for (; j < strs.length - 1; j++) {
                if (!sorted[j] && strs[j].charAt(i) > strs[j + 1].charAt(i)) {
                    res++;
                    break;
                }
            }
            if (j < strs.length - 1) {
                continue;
            }
            j = 0;
            for (; j < strs.length - 1; j++) {
                if (strs[j].charAt(i) < strs[j + 1].charAt(i)) {
                    sorted[j] = true;
                }
            }
        }
        return res;
    }
}
