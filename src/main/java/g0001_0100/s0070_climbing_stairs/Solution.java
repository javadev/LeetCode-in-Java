package g0001_0100.s0070_climbing_stairs;

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Dynamic_Programming #Math #Memoization

public class Solution {
    public int climbStairs(int n) {
        if (n < 2) {
            return n;
        }
        int[] cache = new int[n];
        // creating a cache or DP to store the result
        // so that we dont have to iterate multiple times
        // for the same values;

        // for 0 and 1 the result array i.e cache values would be 1 and 2
        // in loop we are just getting ith values i.e 5th step values from
        // i-1 and i-2 which are 4th step and 3rd step values.
        cache[0] = 1;
        cache[1] = 2;
        for (int i = 2; i < n; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }
        return cache[n - 1];
    }
}
