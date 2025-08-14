package g3601_3700.s3635_earliest_finish_time_for_land_and_water_rides_ii;

// #Medium #Array #Sorting #Greedy #Binary_Search #Two_Pointers #Biweekly_Contest_162
// #2025_08_14_Time_2_ms_(100.00%)_Space_55.78_MB_(68.53%)

public class Solution {
    public int earliestFinishTime(
            int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans = Integer.MAX_VALUE;
        // take land first
        int n = landStartTime.length;
        int minEnd = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            minEnd = Math.min(minEnd, landStartTime[i] + landDuration[i]);
        }
        int m = waterStartTime.length;
        for (int i = 0; i < m; i++) {
            ans = Math.min(ans, waterDuration[i] + Math.max(minEnd, waterStartTime[i]));
        }
        // take water first
        minEnd = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            minEnd = Math.min(minEnd, waterStartTime[i] + waterDuration[i]);
        }
        for (int i = 0; i < n; i++) {
            ans = Math.min(ans, landDuration[i] + Math.max(minEnd, landStartTime[i]));
        }
        return ans;
    }
}
