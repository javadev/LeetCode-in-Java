package g2501_2600.s2589_minimum_time_to_complete_all_tasks;

// #Hard #Array #Sorting #Greedy #Binary_Search #Stack
// #2023_08_22_Time_19_ms_(97.26%)_Space_43.9_MB_(72.60%)

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int findMinimumTime(int[][] tasks) {
        Arrays.sort(tasks, Comparator.comparingInt(a -> a[1]));
        boolean[] visited = new boolean[2001];
        int output = 0;
        for (int[] row : tasks) {
            int num = 0;
            for (int i = row[0]; i <= row[1]; i++) {
                if (visited[i]) {
                    num++;
                }
            }
            int j = row[1];
            while (num < row[2]) {
                if (!visited[j]) {
                    visited[j] = true;
                    num++;
                    output++;
                }
                j--;
            }
        }
        return output;
    }
}
