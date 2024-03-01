package g2801_2900.s2836_maximize_value_of_function_in_a_ball_passing_game;

// #Hard #Array #Dynamic_Programming #Bit_Manipulation
// #2023_12_12_Time_235_ms_(45.00%)_Space_134.3_MB_(47.50%)

import java.util.List;

public class Solution {
    public long getMaxFunctionValue(List<Integer> receiver, long k) {
        int upper = (int) Math.floor(Math.log(k) / Math.log(2));
        int n = receiver.size();
        int[][] next = new int[n][upper + 1];
        long[][] res = new long[n][upper + 1];

        int[] kBit = new int[upper + 1];
        long currK = k;
        for (int x = 0; x < n; x++) {
            next[x][0] = receiver.get(x);
            res[x][0] = receiver.get(x);
        }
        for (int i = 0; i <= upper; i++) {
            kBit[i] = (int) (currK & 1);
            currK = currK >> 1;
        }

        for (int i = 1; i <= upper; i++) {
            for (int x = 0; x < n; x++) {
                int nxt = next[x][i - 1];
                next[x][i] = next[nxt][i - 1];
                res[x][i] = res[x][i - 1] + res[nxt][i - 1];
            }
        }
        long ans = 0;
        for (int x = 0; x < n; x++) {
            long sum = x;
            int i = 0;
            int curr = x;
            while (i <= upper) {
                if (kBit[i] == 0) {
                    i++;
                    continue;
                }
                sum += res[curr][i];
                curr = next[curr][i];
                i++;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
