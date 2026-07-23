package g3801_3900.s3844_longest_almost_palindromic_substring;

// #Medium #String #Dynamic_Programming #Two_Pointers #Staff #Weekly_Contest_489
// #2026_07_22_Time_10_ms_(99.05%)_Space_44.41_MB_(61.90%)

public class Solution {
    private int n;
    private char[] s;

    public int almostPalindromic(String str) {
        s = str.toCharArray();
        n = s.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, f(i, i));
            ans = Math.max(ans, f(i, i + 1));
        }
        return ans;
    }

    private int f(int l, int r) {
        while (l >= 0 && r < n && s[l] == s[r]) {
            l--;
            r++;
        }
        int l1 = l - 1;
        int r1 = r;
        int l2 = l;
        int r2 = r + 1;
        while (l1 >= 0 && r1 < n && s[l1] == s[r1]) {
            l1--;
            r1++;
        }
        while (l2 >= 0 && r2 < n && s[l2] == s[r2]) {
            l2--;
            r2++;
        }
        return Math.clamp(Math.max(r1 - l1 - 1, r2 - l2 - 1), 0, n);
    }
}
