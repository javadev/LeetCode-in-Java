package g0301_0400.s0343_integer_break;

// #Medium #Dynamic_Programming #Math

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private final Map<Integer, Integer> memo = new HashMap<>();

    public int integerBreak(int n) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        if (n == 2) {
            return 1;
        }
        int ans = 0;
        for (int i = 1; i <= n / 2; i++) {
            int ret = integerBreak(n - i);
            int product = Math.max(i * (n - i), i * ret);
            ans = Math.max(ans, product);
        }
        memo.put(n, ans);
        return ans;
    }
}
