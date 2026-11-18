package g4001_4100.s4009_minimum_possible_maximum_waiting_time;

// #Hard #Array #Dynamic_Programming #Memoization #Senior_Staff #Biweekly_Contest_188
// #2026_11_18_Time_39_ms_(97.73%)_Space_46.82_MB_(75.00%)

public class Solution {
    public int minMaxWaitingTime(int[] demand, int[] fuel) {
        int result = solve(0, fuel[0], fuel[1], 0, 0, demand, new java.util.HashMap<>());
        return (result >>> 5) == 0 ? -1 : result & 31;
    }

    private int solve(
            int index,
            int fuel0,
            int fuel1,
            int busy0,
            int busy1,
            int[] demand,
            java.util.HashMap<Integer, Integer> memo) {
        if (index == demand.length) {
            return 0;
        }
        int key = (index << 22) | (fuel0 << 16) | (fuel1 << 10) | (busy0 << 5) | busy1;
        Integer cached = memo.get(key);
        if (cached != null) {
            return cached;
        }
        int best = 0;
        int required = demand[index];
        if (fuel0 >= required) {
            int wait = busy0;
            int child =
                    solve(
                            index + 1,
                            fuel0 - required,
                            fuel1,
                            required,
                            Math.max(0, busy1 - wait),
                            demand,
                            memo);
            best = (1 + (child >>> 5)) * 32 + Math.max(wait, child & 31);
        }
        if (fuel1 >= required) {
            int wait = busy1;
            int child =
                    solve(
                            index + 1,
                            fuel0,
                            fuel1 - required,
                            Math.max(0, busy0 - wait),
                            required,
                            demand,
                            memo);
            int candidate = (1 + (child >>> 5)) * 32 + Math.max(wait, child & 31);
            if ((candidate >>> 5) > (best >>> 5)
                    || ((candidate >>> 5) == (best >>> 5) && (candidate & 31) < (best & 31))) {
                best = candidate;
            }
        }
        memo.put(key, best);
        return best;
    }
}
