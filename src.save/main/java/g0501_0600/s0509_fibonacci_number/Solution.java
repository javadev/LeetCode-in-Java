package g0501_0600.s0509_fibonacci_number;

// #Easy #Dynamic_Programming #Math #Recursion #Memoization

public class Solution {
    private int memo[] = new int[31];

    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = fib(n - 1) + fib(n - 2);
        return memo[n];
    }
}
