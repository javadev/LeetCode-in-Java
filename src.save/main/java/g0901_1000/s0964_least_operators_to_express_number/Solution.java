package g0901_1000.s0964_least_operators_to_express_number;

// #Hard #Dynamic_Programming #Math #2022_03_31_Time_16_ms_(37.78%)_Space_43.4_MB_(11.11%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private Map<String, Integer> map = new HashMap<>();
    private int x;

    public int leastOpsExpressTarget(int x, int target) {
        this.x = x;
        if (x == target) {
            return 0;
        }
        return dfs(0, target) - 1;
    }

    // ax^0 + bx^1 + cx^2 +....
    // think it as base x problem
    private int dfs(int ex, long target) {
        if (target == 0) {
            return 0;
        }
        if (ex > 40) {
            return 10000000;
        }
        String state = ex + "," + target;
        if (map.containsKey(state)) {
            return map.get(state);
        }
        int res = Integer.MAX_VALUE;
        int mod = (int) (target % x);
        if (mod == 0) {
            if (ex == 0) {
                // not use
                res = Math.min(res, dfs(ex + 1, target));
            } else {
                // not use
                res = Math.min(res, dfs(ex + 1, target / x));
            }
        } else {
            // division is needed
            if (ex == 0) {
                res = Math.min(res, 2 * mod + dfs(ex + 1, target - mod));
                res = Math.min(res, 2 * (x - mod) + dfs(ex + 1, target - mod + x));
            } else {
                res = Math.min(res, (ex - 1) * mod + dfs(ex + 1, (target - mod) / x));
                res = Math.min(res, (ex - 1) * (x - mod) + dfs(ex + 1, (target - mod + x) / x));
            }
        }
        map.put(state, res);
        return res;
    }
}
