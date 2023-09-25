package g0601_0700.s0621_task_scheduler;

// #Medium #Array #Hash_Table #Sorting #Greedy #Heap_Priority_Queue #Counting #Level_2_Day_5_Greedy
// #2022_03_21_Time_3_ms_(84.32%)_Space_59.6_MB_(58.24%)

public class Solution {
    public int leastInterval(char[] tasks, int n) {
        if (n <= 0) {
            return tasks.length;
        }
        int[] counters = new int[26];
        int maxCount = 0;
        for (char task : tasks) {
            int idx = task - 'A';
            counters[idx]++;
            maxCount = Math.max(maxCount, counters[idx]);
        }
        int maxNum = 0;
        for (int counter : counters) {
            if (counter == maxCount) {
                maxNum++;
            }
        }
        return Math.max(tasks.length, (maxCount - 1) * (n + 1) + maxNum);
    }
}
