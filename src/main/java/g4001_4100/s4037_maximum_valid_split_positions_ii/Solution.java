package g4001_4100.s4037_maximum_valid_split_positions_ii;

// #Hard #Array #Math #Enumeration #Number_Theory #Principal #Biweekly_Contest_190
// #2026_11_25_Time_12_ms_(95.65%)_Space_120.92_MB_(69.57%)

public class Solution {
    public int maxValidSplits(int[] nums) {
        int n = nums.length;
        int[] preGcd = new int[n];
        int g = 0;
        for (int i = 0; i < n; i++) {
            g = gcd(g, nums[i]);
            preGcd[i] = g;
        }
        int[] sufGcd = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            sufGcd[i] = gcd(sufGcd[i + 1], nums[i]);
        }
        int allGcd = sufGcd[0];
        int p = 0;
        while (preGcd[p] != allGcd) {
            p++;
        }
        int q = n - 1;
        while (sufGcd[q] != allGcd) {
            q--;
        }
        int ans = Math.max(q - p, 0);
        for (int i = 0; i < n; i++) {
            if (i > 0 && preGcd[i] == preGcd[i - 1]) {
                continue;
            }
            int newG = i > 0 ? gcd(preGcd[i - 1], sufGcd[i + 1]) : sufGcd[i + 1];
            if (newG == allGcd) {
                continue;
            }
            g = 0;
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    continue;
                }
                g = gcd(g, nums[j]);
                if (g == newG) {
                    p = j;
                    break;
                }
            }
            g = 0;
            for (int j = n - 1; j >= 0; j--) {
                if (j == i) {
                    continue;
                }
                g = gcd(g, nums[j]);
                if (g == newG) {
                    q = j;
                    break;
                }
            }
            int res = q - p;
            if (p <= i && i < q) {
                res--;
            }
            ans = Math.max(ans, res);
            break;
        }
        return ans;
    }

    private int gcd(int a, int b) {
        while (a != 0) {
            int tmp = a;
            a = b % a;
            b = tmp;
        }
        return b;
    }
}
