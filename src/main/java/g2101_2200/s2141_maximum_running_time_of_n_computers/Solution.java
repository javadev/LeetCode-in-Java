package g2101_2200.s2141_maximum_running_time_of_n_computers;

// #Hard #Array #Sorting #Greedy #Binary_Search
// #2022_06_05_Time_24_ms_(70.39%)_Space_83.1_MB_(5.83%)

public class Solution {
    private boolean isPossibeToRun(int n, int[] batteries, long avgTime) {
        long duration = 0;
        for (long ele : batteries) {
            duration += Math.min(ele, avgTime);
        }
        return avgTime * n <= duration;
    }

    public long maxRunTime(int n, int[] batteries) {
        long startTime = 0;
        long sum = 0;
        long ans = 0;
        for (long ele : batteries) {
            sum += ele;
        }
        long endTime = sum;
        while (startTime <= endTime) {
            long avgTime = (startTime + endTime) / 2;
            if (isPossibeToRun(n, batteries, avgTime)) {
                ans = avgTime;
                startTime = avgTime + 1;
            } else {
                endTime = avgTime - 1;
            }
        }
        return ans;
    }
}
