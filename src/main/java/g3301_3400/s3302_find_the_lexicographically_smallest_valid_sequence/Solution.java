package g3301_3400.s3302_find_the_lexicographically_smallest_valid_sequence;

// #Medium #2024_09_30_Time_33_ms_(100.00%)_Space_79.5_MB_(50.00%)

import java.util.Arrays;

public class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[] revGreedyMatchInd = new int[m];
        Arrays.fill(revGreedyMatchInd, -1);
        {
            int i = n - 1;
            int j = m - 1;
            while (j >= 0 && i >= 0) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    revGreedyMatchInd[j--] = i;
                }
                i--;
            }
        }
        boolean canSkip = true;
        int j = 0;
        int i = 0;
        while (i < n && j < m && m - j <= n - i) {
            if (word1.charAt(i) == word2.charAt(j)) {
                revGreedyMatchInd[j++] = i;
            } else if (canSkip && (j == m - 1 || i < revGreedyMatchInd[j + 1])) {
                revGreedyMatchInd[j++] = i;
                canSkip = false;
            } else if (!canSkip && revGreedyMatchInd[j] == -1) {
                break;
            }
            i++;
        }
        return j == m ? revGreedyMatchInd : new int[0];
    }
}
