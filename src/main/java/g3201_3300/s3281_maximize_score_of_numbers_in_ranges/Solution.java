package g3201_3300.s3281_maximize_score_of_numbers_in_ranges;

// #Medium #Array #Sorting #Greedy #Binary_Search
// #2024_09_09_Time_47_ms_(100.00%)_Space_58.3_MB_(100.00%)

import java.util.Arrays;

public class Solution {
    public int maxPossibleScore(int[] start, int d) {
        Arrays.sort(start);
        int n = start.length;
        int l = 0;
        int r = start[n - 1] - start[0] + d + 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (isPossible(start, d, m)) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l - 1;
    }

    private boolean isPossible(int[] start, int d, int score) {
        int pre = start[0];
        for (int i = 1; i < start.length; i++) {
            if (start[i] + d - pre < score) {
                return false;
            }
            pre = Math.max(start[i], pre + score);
        }
        return true;
    }
}
