package g0301_0400.s0375_guess_number_higher_or_lower_ii;

// #Medium #Dynamic_Programming #Math #Game_Theory

/*
Trivial Case:
There is only one value to search, n=1 -> no cost return 0
If there are two possible values n=2, -> return the lowest of them -> 1

If there are any higher numbers to search (1....n)
divide the search space (1...i-1, i, i+1, ... n)
The cost = min( i + max(1..i-1, i+1 ... n))

There is no other intelligent way to search and find the cost

Optimization:
    The best cost will be near the higher side (not in middle)
    - for some i (close to n), the cost will be min and then start to increase if i is shifted left or right.

*/

public class Solution {
    public int getMoneyAmount(int n) {
        dp = new Integer[n][n];
        return solve(1, n);
    }
    Integer[][] dp;
    private int solve(int from, int to) {
        if (from >= to) {
            return 0;
        }
        if (from + 1 == to) {
            return from;
        }
        if (dp[from - 1][to - 1] != null) {
            return dp[from - 1][to - 1];
        }
        int result = Integer.MAX_VALUE;
        for (int mid = to; mid >= from; mid--) {
            int left = solve(from, mid - 1);
            int right = solve(mid + 1, to);
            int max = mid + Math.max(left, right);
            if (max <= result) {
                result = max;
            } else {
                break;
            }
        }
        return dp[from - 1][to - 1] = result;
    }
}
