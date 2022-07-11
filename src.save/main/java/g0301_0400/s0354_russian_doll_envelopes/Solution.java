package g0301_0400.s0354_russian_doll_envelopes;

// #Hard #Array #Dynamic_Programming #Sorting #Binary_Search
// #2022_07_11_Time_46_ms_(99.83%)_Space_85.4_MB_(19.85%)

import java.util.Arrays;

public class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> a[0] != b[0] ? a[0] - b[0] : b[1] - a[1]);
        int[] tails = new int[envelopes.length];
        int size = 0;
        for (int[] enve : envelopes) {
            int i = 0;
            int j = size;
            while (i != j) {
                int mid = i + ((j - i) >> 1);
                if (tails[mid] < enve[1]) {
                    i = mid + 1;
                } else {
                    j = mid;
                }
            }
            tails[i] = enve[1];
            if (i == size) {
                size++;
            }
        }
        return size;
    }
}
