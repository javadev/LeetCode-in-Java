package g3601_3700.s3633_earliest_finish_time_for_land_and_water_rides_i;

// #Easy #Biweekly_Contest_162 #2025_08_03_Time_3_ms_(100.00%)_Space_45.04_MB_(33.33%)

public class Solution {
    public int earliestFinishTime(
            int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int res = Integer.MAX_VALUE;
        int n = landStartTime.length;
        int m = waterStartTime.length;
        // Try all combinations of one land and one water ride
        for (int i = 0; i < n; i++) {
            // start time of land ride
            int a = landStartTime[i];
            // duration of land ride
            int d = landDuration[i];
            for (int j = 0; j < m; j++) {
                // start time of water ride
                int b = waterStartTime[j];
                // duration of water ride
                int e = waterDuration[j];
                // Case 1: Land → Water
                int landEnd = a + d;
                // wait if needed
                int startWater = Math.max(landEnd, b);
                int finish1 = startWater + e;
                // Case 2: Water → Land
                int waterEnd = b + e;
                // wait if needed
                int startLand = Math.max(waterEnd, a);
                int finish2 = startLand + d;
                // Take the minimum finish time
                res = Math.min(res, Math.min(finish1, finish2));
            }
        }
        return res;
    }
}
