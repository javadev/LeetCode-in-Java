package g1701_1800.s1723_find_minimum_time_to_finish_all_jobs;

// #Hard #Array #Dynamic_Programming #Bit_Manipulation #Backtracking #Bitmask
// #2022_04_25_Time_3_ms_(76.73%)_Space_41.4_MB_(72.04%)

public class Solution {
    private int min = Integer.MAX_VALUE;

    public int minimumTimeRequired(int[] jobs, int k) {
        backtraking(jobs, jobs.length - 1, new int[k]);
        return min;
    }

    private void backtraking(int[] jobs, int j, int[] sum) {
        int max = getMax(sum);
        if (max >= min) {
            return;
        }
        if (j < 0) {
            min = max;
            return;
        }
        for (int i = 0; i < sum.length; i++) {
            if (i > 0 && sum[i] == sum[i - 1]) {
                continue;
            }
            sum[i] += jobs[j];
            backtraking(jobs, j - 1, sum);
            sum[i] -= jobs[j];
        }
    }

    private int getMax(int[] sum) {
        int max = Integer.MIN_VALUE;
        for (int j : sum) {
            max = Math.max(max, j);
        }
        return max;
    }
}
