package g0901_1000.s0932_beautiful_array;

// #Medium #Array #Math #Divide_and_Conquer #2022_03_30_Time_1_ms_(89.66%)_Space_43_MB_(38.97%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private Map<Integer, int[]> memo;

    public int[] beautifulArray(int n) {
        memo = new HashMap<>();
        return helper(n);
    }

    private int[] helper(int n) {
        if (n == 1) {
            memo.put(1, new int[] {1});
            return new int[] {1};
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int mid = (n + 1) / 2;
        int[] left = helper(mid);
        int[] right = helper(n - mid);
        int[] rst = new int[n];
        for (int i = 0; i < mid; i++) {
            rst[i] = left[i] * 2 - 1;
        }
        for (int i = mid; i < n; i++) {
            rst[i] = right[i - mid] * 2;
        }
        memo.put(n, rst);
        return rst;
    }
}
