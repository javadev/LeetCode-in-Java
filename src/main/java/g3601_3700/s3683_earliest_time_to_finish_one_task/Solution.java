package g3601_3700.s3683_earliest_time_to_finish_one_task;

// #Easy #Weekly_Contest_467 #2025_09_20_Time_0_ms_(100.00%)_Space_45.29_MB_(39.62%)

public class Solution {
    public int earliestTime(int[][] tasks) {
        int ans = 1000;
        for (int i = 0; i < tasks.length; i++) {
            int st = tasks[i][0];
            int tm = tasks[i][1];
            ans = Math.min(ans, st + tm);
        }
        return ans;
    }
}
