package g3901_4000.s3984_divisible_game;

// #Medium #Array #Dynamic_Programming #Math #Enumeration #Number_Theory #Staff #Weekly_Contest_509
// #2026_11_03_Time_22_ms_(93.00%)_Space_46.30_MB_(94.00%)

import java.util.HashSet;

public class Solution {
    public int divisibleGame(int[] nums) {
        HashSet<Integer> prime = new HashSet<>();
        int mod = (int) 1e9 + 7;
        long bestscore = nums[0];
        for (int i : nums) {
            bestscore = Math.min(bestscore, i);
        }
        bestscore = -bestscore;
        long bestprime = 2;
        for (int i : nums) {
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    prime.add(j);
                    while (i % j == 0) {
                        i = i / j;
                    }
                }
            }
            if (i > 1) {
                prime.add(i);
            }
        }
        for (int p : prime) {
            long curr = 0;
            long maxi = Long.MIN_VALUE;
            for (int i : nums) {
                long val = (i % p == 0) ? i : -i;
                curr = Math.max(0, curr + val);
                maxi = Math.max(maxi, curr);
            }
            if (maxi > bestscore) {
                bestscore = maxi;
                bestprime = p;
            } else if (maxi == bestscore && p < bestprime) {
                bestprime = p;
            }
        }
        bestscore = ((bestscore % mod) + mod) % mod;
        return (int) ((bestscore * (bestprime % mod)) % mod);
    }
}
