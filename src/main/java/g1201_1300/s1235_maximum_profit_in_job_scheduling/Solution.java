package g1201_1300.s1235_maximum_profit_in_job_scheduling;

// #Hard #Array #Dynamic_Programming #Sorting #Binary_Search
// #2022_03_12_Time_27_ms_(89.19%)_Space_73.8_MB_(49.40%)

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int[][] time = new int[n][3];
        for (int i = 0; i < n; i++) {
            time[i][0] = startTime[i];
            time[i][1] = endTime[i];
            time[i][2] = profit[i];
        }
        Arrays.sort(time, Comparator.comparingInt(a -> a[1]));
        int[][] maxP = new int[n][2];
        int lastPos = -1;
        int currProfit;
        for (int i = 0; i < n; i++) {
            currProfit = time[i][2];
            for (int j = lastPos; j >= 0; j--) {
                if (maxP[j][1] <= time[i][0]) {
                    currProfit += maxP[j][0];
                    break;
                }
            }
            if (lastPos == -1 || currProfit > maxP[lastPos][0]) {
                lastPos++;
                maxP[lastPos][0] = currProfit;
                maxP[lastPos][1] = time[i][1];
            }
        }
        return maxP[lastPos][0];
    }
}
