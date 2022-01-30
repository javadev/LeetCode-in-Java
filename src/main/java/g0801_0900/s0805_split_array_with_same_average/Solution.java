package g0801_0900.s0805_split_array_with_same_average;

// #Hard #Array #Dynamic_Programming #Math #Bit_Manipulation #Bitmask

import java.util.Arrays;

public class Solution {
    public boolean splitArraySameAverage(int[] a) {
        int m = a.length;
        int sum = 0;
        for (int n : a) {
            sum += n;
        }
        Arrays.sort(a);
        for (int len = 1; len <= m / 2; len++) {
            if (sum * len % m == 0 && dfs(a, sum * len / m, len, 0)) {
                return true;
            }
        }
        return false;
    }

    private boolean dfs(int[] a, int sum, int len, int idx) {
        if (len == 0) {
            return sum == 0;
        }
        if (sum < 0 || idx >= a.length) {
            return false;
        }
        if (a[idx] > sum / len) {
            return false;
        }
        for (int i = idx; i < a.length; i++) {
            if (i > idx && a[i] == a[i - 1]) {
                continue;
            }
            if (dfs(a, sum - a[i], len - 1, i + 1)) {
                return true;
            }
        }
        return false;
    }
}
