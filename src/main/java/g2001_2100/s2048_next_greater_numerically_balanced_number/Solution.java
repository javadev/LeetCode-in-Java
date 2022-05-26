package g2001_2100.s2048_next_greater_numerically_balanced_number;

// #Medium #Math #Backtracking #Enumeration #2022_05_26_Time_2_ms_(95.19%)_Space_41.8_MB_(72.12%)

public class Solution {
    public int nextBeautifulNumber(int n) {
        int[] arr = new int[] {0, 1, 2, 3, 4, 5, 6};
        boolean[] select = new boolean[7];
        int d = n == 0 ? 1 : (int) Math.log10(n) + 1;
        return solve(1, n, d, 0, select, arr);
    }

    private int solve(int i, int n, int d, int sz, boolean[] select, int[] arr) {
        if (sz > d + 1) {
            return Integer.MAX_VALUE;
        }
        if (i == select.length) {
            return sz >= d ? make(0, n, sz, select, arr) : Integer.MAX_VALUE;
        }
        int ans = solve(i + 1, n, d, sz, select, arr);
        select[i] = true;
        ans = Math.min(ans, solve(i + 1, n, d, sz + i, select, arr));
        select[i] = false;
        return ans;
    }

    private int make(int cur, int n, int end, boolean[] select, int[] arr) {
        if (end == 0) {
            return cur > n ? cur : Integer.MAX_VALUE;
        }

        int ans = Integer.MAX_VALUE;
        for (int j = 1; j < arr.length; j++) {
            if (!select[j] || arr[j] == 0) {
                continue;
            }
            --arr[j];
            ans = Math.min(make(10 * cur + j, n, end - 1, select, arr), ans);
            ++arr[j];
        }
        return ans;
    }
}
