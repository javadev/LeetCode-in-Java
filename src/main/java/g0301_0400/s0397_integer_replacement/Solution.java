package g0301_0400.s0397_integer_replacement;

// #Medium #Dynamic_Programming #Greedy #Bit_Manipulation #Memoization
// #2022_03_16_Time_0_ms_(100.00%)_Space_39.3_MB_(62.74%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int integerReplacement(int n) {
        Map<Integer, Integer> dp = new HashMap<>();
        return solve(n, dp);
    }

    private int solve(int n, Map<Integer, Integer> dp) {
        if (n == 1) {
            return 0;
        }
        if (dp.containsKey(n)) {
            return dp.get(n);
        }
        int ans;
        if (n % 2 == 0) {
            ans = 1 + solve(n >>> 1, dp);
        } else {
            ans = 1 + Math.min(solve(n + 1, dp), solve(n - 1, dp));
        }
        dp.put(n, ans);
        return ans;
    }
}
