package g2201_2300.s2274_maximum_consecutive_floors_without_special_floors;

// #Medium #Array #Sorting #2022_06_15_Time_33_ms_(99.36%)_Space_56.9_MB_(92.31%)

import java.util.Arrays;

public class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int start = bottom;
        int ans = 0;
        for (int j : special) {
            if (j - start > ans) {
                ans = j - start;
                start = j + 1;
            } else {
                start = j + 1;
            }
        }
        if (ans < top - special[special.length - 1]) {
            ans = top - special[special.length - 1];
        }
        return ans;
    }
}
