package g0601_0700.s0679_24_game;

// #Hard #Array #Math #Backtracking #2022_03_22_Time_3_ms_(87.01%)_Space_39.4_MB_(95.06%)

import java.util.Arrays;

public class Solution {
    private static final double EPS = 1e-6;

    private boolean backtrack(double[] list, int n) {
        if (n == 1) {
            return Math.abs(list[0] - 24) < EPS;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double a = list[i];
                double b = list[j];
                list[j] = list[n - 1];
                list[i] = a + b;
                if (backtrack(list, n - 1)) {
                    return true;
                }
                list[i] = a - b;
                if (backtrack(list, n - 1)) {
                    return true;
                }
                list[i] = b - a;
                if (backtrack(list, n - 1)) {
                    return true;
                }
                list[i] = a * b;
                if (backtrack(list, n - 1)) {
                    return true;
                }
                if (Math.abs(b) > EPS) {
                    list[i] = a / b;
                    if (backtrack(list, n - 1)) {
                        return true;
                    }
                }
                if (Math.abs(a) > EPS) {
                    list[i] = b / a;
                    if (backtrack(list, n - 1)) {
                        return true;
                    }
                }
                list[i] = a;
                list[j] = b;
            }
        }
        return false;
    }

    public boolean judgePoint24(int[] nums) {
        double[] a = Arrays.stream(nums).asDoubleStream().toArray();
        return backtrack(a, a.length);
    }
}
