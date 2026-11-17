package g4001_4100.s4012_count_of_unfinished_tasks_after_each_shift;

// #Medium #Array #Binary_Search #Prefix_Sum #Staff #Weekly_Contest_513
// #2026_11_17_Time_7_ms_(100.00%)_Space_163.12_MB_(44.36%)

public class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {
        int m = tasks.length;
        int n = shifts.length;
        long[] s = new long[m + 1];
        for (int i = 0; i < m; i++) {
            s[i + 1] = s[i] + tasks[i];
        }
        int[] ans = new int[n];
        int i = 0;
        long cur = 0;
        for (int j = 0; j < n; j++) {
            if (shifts[j] < tasks[i] - cur) {
                cur += shifts[j];
                ans[j] = m - i;
            } else {
                long t = shifts[j] - (tasks[i] - cur);
                if (t >= s[m] - s[i + 1]) {
                    i = 0;
                    cur = 0;
                } else {
                    int l = i + 1;
                    int r = m;
                    while (l < r) {
                        int mid = (l + r) >> 1;
                        if (t < s[mid + 1] - s[i + 1]) {
                            r = mid;
                        } else {
                            l = mid + 1;
                        }
                    }
                    cur = t - (s[l] - s[i + 1]);
                    i = l;
                    ans[j] = m - i;
                }
            }
        }
        return ans;
    }
}
