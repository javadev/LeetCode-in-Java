package g1901_2000.s1986_minimum_number_of_work_sessions_to_finish_the_tasks;

// #Medium #Array #Dynamic_Programming #Bit_Manipulation #Backtracking #Bitmask
// #2022_05_17_Time_2_ms_(90.18%)_Space_41.3_MB_(82.65%)

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int minSessions(int[] tasks, int sessionTime) {
        int len = tasks.length;
        // minimum, all tasks can fit into 1 session
        int i = 1;
        // maximum, each task take 1 session to finish
        int j = len;
        while (i < j) {
            // try m sessions to see whether it can work
            int m = (i + j) / 2;
            if (canFit(tasks, new int[m], sessionTime, len - 1)) {
                j = m;
            } else {
                i = m + 1;
            }
        }
        return i;
    }

    private boolean canFit(int[] tasks, int[] sessions, int sessionTime, int idx) {
        // all tasks have been taken care of
        if (idx == -1) {
            return true;
        }
        Set<Integer> dup = new HashSet<>();
        // now to take care of tasks[idx]
        // try each spot
        for (int i = 0; i < sessions.length; i++) {
            // current spot cannot fit
            if (sessions[i] + tasks[idx] > sessionTime || dup.contains(sessions[i] + tasks[idx])) {
                continue;
            }
            dup.add(sessions[i] + tasks[idx]);
            sessions[i] += tasks[idx];
            if (canFit(tasks, sessions, sessionTime, idx - 1)) {
                return true;
            }
            sessions[i] -= tasks[idx];
        }
        return false;
    }
}
