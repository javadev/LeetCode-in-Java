package g3101_3200.s3154_find_number_of_ways_to_reach_the_k_th_stair;

// #Hard #Dynamic_Programming #Math #Bit_Manipulation #Memoization #Combinatorics
// #2024_05_22_Time_0_ms_(100.00%)_Space_40.3_MB_(98.50%)

public class Solution {
    public int waysToReachStair(int k) {
        int x = 1;
        int y = 1;
        int a = 0;
        while (x > 0 && x - y <= k) {
            if (x >= k) {
                a += combi(y, x - k);
            }
            x <<= 1;
            y++;
        }
        return a;
    }

    private int combi(int a, int b) {
        if (b > a - b) {
            b = a - b;
        }
        long r = 1;
        for (int i = 0; i < b; i++) {
            r *= (a - i);
            r /= (i + 1);
        }
        return (int) r;
    }
}
