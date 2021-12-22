package g0301_0400.s0397_integer_replacement;

import java.util.HashMap;

// #Medium #Dynamic_Programming #Greedy #Bit_Manipulation #Memoization

public class Solution {
    public int integerReplacement(int n) {
        HashMap<Integer, Integer> dp = new HashMap();
        return solve(n, dp);
    }

    public static int solve(int n, HashMap<Integer, Integer> dp) {
        if (n == 1) {
            return 0;
        }
        if (dp.containsKey(n)) {
            return dp.get(n);
        }
        int ans = 0;
        if (n % 2 == 0) {
            ans = 1 + solve(n >>> 1, dp);
        } else {
            ans = 1 + Math.min(solve(n + 1, dp), solve(n - 1, dp));
        }
        dp.put(n, ans);
        return ans;
    }
}
