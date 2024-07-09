package g3201_3300.s3208_alternating_groups_ii;

// #Medium #Array #Sliding_Window #2024_07_09_Time_2_ms_(99.02%)_Space_63.3_MB_(22.96%)

public class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int i = 0;
        int len = 0;
        int total = 0;
        while (i < colors.length - 1) {
            int j = i + 1;
            if (colors[j] != colors[i]) {
                len = 2;
                j++;
                while (j < colors.length && colors[j] != colors[j - 1]) {
                    j++;
                    len++;
                }
                if (j == colors.length) {
                    break;
                }
                total += Math.max(0, (len - k + 1));
            }
            i = j;
            len = 0;
        }
        if (colors[0] != colors[colors.length - 1]) {
            // if(len == colors.length) {
            //     return Math.max(0, colors.length);
            // }
            len = len == 0 ? 2 : len + 1;
            int j = 1;
            while (j < colors.length && colors[j] != colors[j - 1]) {
                j++;
                len++;
            }
            if (j >= k) {
                len -= (j - k + 1);
            }
        }
        total += Math.max(0, (len - k + 1));
        return total;
    }
}
