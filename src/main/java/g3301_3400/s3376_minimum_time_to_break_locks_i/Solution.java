package g3301_3400.s3376_minimum_time_to_break_locks_i;

// #Medium #Array #Dynamic_Programming #Bit_Manipulation #Backtracking #Bitmask
// #2024_12_10_Time_3_ms_(99.63%)_Space_42_MB_(92.34%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int findMinimumTime(List<Integer> strength, int k) {
        List<Integer> strengthLocal = new ArrayList<>(strength);
        Collections.sort(strengthLocal);
        int res = strengthLocal.get(0);
        strengthLocal.remove(0);
        int x = 1;
        while (!strengthLocal.isEmpty()) {
            x += k;
            int nextTime = (strengthLocal.get(0) - 1) / x + 1;
            int canBreak = nextTime * x;
            int indexRemove = findIndex(strengthLocal, canBreak);
            if (strengthLocal.size() > 1) {
                int nextTime1 = (strengthLocal.get(1) - 1) / x + 1;
                int canBreak1 = nextTime1 * x;
                int indexRemove1 = findIndex(strengthLocal, canBreak1);
                if (nextTime1 + (strengthLocal.get(0) - 1) / (x + k)
                        < nextTime + (strengthLocal.get(1) - 1) / (x + k)) {
                    nextTime = nextTime1;
                    indexRemove = indexRemove1;
                }
            }
            res += nextTime;
            strengthLocal.remove(indexRemove);
        }
        return res;
    }

    private int findIndex(List<Integer> strength, int canBreak) {
        int l = 0;
        int r = strength.size() - 1;
        int res = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (strength.get(mid) <= canBreak) {
                res = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return res;
    }
}
