package g3601_3700.s3683_earliest_time_to_finish_one_task;

// #Easy #Weekly_Contest_467 #2025_09_14_Time_1_ms_(100.00%)_Space_44.90_MB_(100.00%)

public class Solution {
    public int earliestTime(int[][] tasks) {
        if (tasks.length == 1) {
            int sum = 0;
            for (int t : tasks[0]) {
                sum += t;
            }
            return sum;
        }
        int minTask = 0;
        for (int t : tasks[0]) {
            minTask += t;
        }
        for (int i = 1; i < tasks.length; i++) {
            int sum = 0;
            for (int t : tasks[i]) {
                sum += t;
            }
            if (sum < minTask) {
                minTask = sum;
            }
        }
        return minTask;
    }
}
