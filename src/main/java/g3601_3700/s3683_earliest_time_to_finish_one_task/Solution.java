package g3601_3700.s3683_earliest_time_to_finish_one_task;

// #Easy #Array #Weekly_Contest_467 #2025_09_26_Time_1_ms_(77.01%)_Space_45.24_MB_(38.70%)

public class Solution {
    public int earliestTime(int[][] tasks) {
        int ans = 1000;
        for (int[] task : tasks) {
            int st = task[0];
            int tm = task[1];
            ans = Math.min(ans, st + tm);
        }
        return ans;
    }
}
