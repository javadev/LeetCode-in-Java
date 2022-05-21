package g1901_2000.s1982_find_array_given_subset_sums;

// #Hard #Array #Divide_and_Conquer #2022_05_21_Time_70_ms_(64.91%)_Space_83.3_MB_(70.18%)

import java.util.Arrays;

public class Solution {
    public int[] recoverArray(int n, int[] sums) {
        Arrays.sort(sums);
        int m = sums.length;
        int zeroShift = 0;
        int[] res = new int[n];
        for (int i = 0; i < n; ++i) {
            int diff = sums[1] - sums[0];
            int p = 0;
            int k = 0;
            int zpos = m;
            for (int j = 0; j < m; ++j) {
                if (k < p && sums[k] == sums[j]) {
                    k++;
                } else {
                    if (zeroShift == sums[j]) {
                        zpos = p;
                    }
                    sums[p++] = sums[j] + diff;
                }
            }
            if (zpos >= m / 2) {
                res[i] = -diff;
            } else {
                res[i] = diff;
                zeroShift += diff;
            }
            m /= 2;
        }
        return res;
    }
}
