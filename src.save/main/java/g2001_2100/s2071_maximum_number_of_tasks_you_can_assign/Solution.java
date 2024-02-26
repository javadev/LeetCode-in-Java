package g2001_2100.s2071_maximum_number_of_tasks_you_can_assign;

// #Hard #Array #Sorting #Greedy #Binary_Search #Queue #Monotonic_Queue
// #2022_05_30_Time_156_ms_(40.49%)_Space_117.1_MB_(61.46%)

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Solution {
    public int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {
        int left = 0;
        int right = Math.min(tasks.length, workers.length);
        Arrays.sort(tasks);
        Arrays.sort(workers);
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (canAssign(mid, tasks, workers, pills, strength)) {
                left = mid;
            } else {
                right = mid;
            }
        }
        if (canAssign(right, tasks, workers, pills, strength)) {
            return right;
        } else {
            return left;
        }
    }

    private boolean canAssign(int count, int[] tasks, int[] workers, int pills, int strength) {
        Deque<Integer> dq = new ArrayDeque<>();
        int ind = workers.length - 1;
        for (int i = count - 1; i >= 0; i--) {
            while (ind >= workers.length - count && workers[ind] + strength >= tasks[i]) {
                dq.offerLast(workers[ind]);
                ind--;
            }
            if (dq.isEmpty()) {
                return false;
            }
            if (dq.peekFirst() >= tasks[i]) {
                dq.pollFirst();
            } else {
                dq.pollLast();
                pills--;
                if (pills < 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
