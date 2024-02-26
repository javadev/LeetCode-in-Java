package g2901_3000.s2961_double_modular_exponentiation;

// #Medium #Array #Math #Simulation #2024_01_15_Time_1_ms_(100.00%)_Space_44.5_MB_(11.00%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private long myPow(int a, int b, int mod) {
        long ans = 1;
        if (b == 0) {
            return 1;
        }
        if (a <= 1) {
            return a;
        }
        while (b > 0) {
            if (b % 2 == 0) {
                a = a * a % mod;
                b = b / 2;
            } else {
                ans *= a;
                b -= 1;
                ans = ans % mod;
            }
        }
        return ans;
    }

    public List<Integer> getGoodIndices(int[][] variables, int target) {
        int n = variables.length;
        List<Integer> goodIndices = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int ai = variables[i][0];
            int bi = variables[i][1];
            int ci = variables[i][2];
            int mi = variables[i][3];
            long ans = myPow(ai % 10, bi, 10) % 10;
            ans = myPow((int) ans, ci, mi) % mi;
            if (ans == target) {
                goodIndices.add(i);
            }
        }
        return goodIndices;
    }
}
