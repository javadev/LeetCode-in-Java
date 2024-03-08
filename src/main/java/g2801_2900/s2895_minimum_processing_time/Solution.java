package g2801_2900.s2895_minimum_processing_time;

// #Medium #Array #Sorting #Greedy #2023_12_20_Time_23_ms_(99.30%)_Space_59.9_MB_(23.37%)

import java.util.Arrays;
import java.util.List;

public class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        int[] proc = new int[processorTime.size()];
        for (int i = 0, n = processorTime.size(); i < n; i++) {
            proc[i] = processorTime.get(i);
        }
        int[] jobs = new int[tasks.size()];
        for (int i = 0, n = tasks.size(); i < n; i++) {
            jobs[i] = tasks.get(i);
        }
        Arrays.sort(proc);
        Arrays.sort(jobs);
        int maxTime = 0;
        for (int i = 0, n = proc.length; i < n; i++) {
            int procTime = proc[i] + jobs[jobs.length - 1 - i * 4];
            if (procTime > maxTime) {
                maxTime = procTime;
            }
        }
        return maxTime;
    }
}
