package g3701_3800.s3776_minimum_moves_to_balance_circular_array;

// #Medium #Array #Sorting #Greedy #Staff #Weekly_Contest_480
// #2026_05_08_Time_2_ms_(100.00%)_Space_139.96_MB_(20.95%)

public class Solution {
    public long minMoves(int[] balance) {
        int n = balance.length;
        int j = -1;
        long total = 0;
        long res = 0;
        for (int i = 0; i < n; i++) {
            if (balance[i] < 0) {
                j = i;
            }
            total += balance[i];
        }
        if (j == -1) {
            return 0;
        }
        if (total < 0) {
            return -1;
        }
        for (int d = 1; balance[j] < 0; ++d) {
            long storage = balance[(j + d) % n] + balance[(j - d % n + n) % n];
            res += Math.min(-balance[j], storage) * d;
            balance[j] += storage;
        }
        return res;
    }
}
