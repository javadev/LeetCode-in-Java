package g2501_2600.s2511_maximum_enemy_forts_that_can_be_captured;

// #Easy #Array #Two_Pointers #2023_03_21_Time_0_ms_(100.00%)_Space_40.9_MB_(19.40%)

public class Solution {
    public int captureForts(int[] forts) {
        int maxCapture = 0;
        int n = forts.length;
        int i = 0;
        while (i < n) {
            if (forts[i] == 1) {
                int currMax = 0;
                i++;
                while (i < n && forts[i] == 0) {
                    currMax++;
                    i++;
                }
                if (i < n && forts[i] == -1) {
                    maxCapture = Math.max(maxCapture, currMax);
                }
                i--;
            } else if (forts[i] == -1) {
                int currMax = 0;
                i++;
                while (i < n && forts[i] == 0) {
                    currMax++;
                    i++;
                }
                if (i < n && forts[i] == 1) {
                    maxCapture = Math.max(maxCapture, currMax);
                }
                i--;
            }
            i++;
        }
        return maxCapture;
    }
}
