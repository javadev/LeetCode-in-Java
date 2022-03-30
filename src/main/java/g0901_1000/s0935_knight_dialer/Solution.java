package g0901_1000.s0935_knight_dialer;

// #Medium #Dynamic_Programming #2022_03_30_Time_4_ms_(99.08%)_Space_42.2_MB_(81.87%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static final int[][] MAP = new int[10][];
    private static final List<int[]> MEMO = new ArrayList<>();

    static {
        MAP[0] = new int[] {4, 6};
        MAP[1] = new int[] {6, 8};
        MAP[2] = new int[] {7, 9};
        MAP[3] = new int[] {4, 8};
        MAP[4] = new int[] {3, 9, 0};
        MAP[5] = new int[0];
        MAP[6] = new int[] {1, 7, 0};
        MAP[7] = new int[] {2, 6};
        MAP[8] = new int[] {1, 3};
        MAP[9] = new int[] {2, 4};
        MEMO.add(new int[] {1, 1, 1, 1, 1, 0, 1, 1, 1, 1});
    }

    public int knightDialer(int n) {
        if (n == 1) {
            return 10;
        }
        int mod = 1000_000_007;
        while (MEMO.size() < n) {
            int[] cur = MEMO.get(MEMO.size() - 1);
            int[] next = new int[10];
            for (int i = 0; i < 10; i++) {
                for (int d : MAP[i]) {
                    next[d] = (next[d] + cur[i]) % mod;
                }
            }
            MEMO.add(next);
        }
        int sum = 0;
        for (int x : MEMO.get(n - 1)) {
            sum = (sum + x) % mod;
        }
        return sum;
    }
}
