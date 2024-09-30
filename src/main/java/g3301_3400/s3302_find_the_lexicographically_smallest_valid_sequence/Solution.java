package g3301_3400.s3302_find_the_lexicographically_smallest_valid_sequence;

// #Medium #2024_09_30_Time_33_ms_(100.00%)_Space_79.5_MB_(50.00%)

import java.util.Arrays;

public class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[] revGreedyMatchInd = new int[m];
        Arrays.fill(revGreedyMatchInd, -1);
        int i = n - 1;
        int j = m - 1;
        while (j >= 0 && i >= 0) {
            if (word1.charAt(i) == word2.charAt(j)) {
                revGreedyMatchInd[j--] = i;
            }
            i--;
        }
        boolean canSkip = true;
        int j1 = 0;
        int i1 = 0;
        while (i1 < n && j1 < m && m - j1 <= n - i1) {
            if (word1.charAt(i1) == word2.charAt(j1)) {
                revGreedyMatchInd[j1++] = i1;
            } else if (canSkip && (j1 == m - 1 || i1 < revGreedyMatchInd[j1 + 1])) {
                revGreedyMatchInd[j1++] = i1;
                canSkip = false;
            } else if (!canSkip && revGreedyMatchInd[j1] == -1) {
                break;
            }
            i1++;
        }
        return j1 == m ? revGreedyMatchInd : new int[0];
    }
}
