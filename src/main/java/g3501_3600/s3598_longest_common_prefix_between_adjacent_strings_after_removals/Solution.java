package g3501_3600.s3598_longest_common_prefix_between_adjacent_strings_after_removals;

// #Medium #Array #String #2025_06_30_Time_28_ms_(74.57%)_Space_67.08_MB_(39.11%)

public class Solution {
    private int solve(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int cnt = 0;
        while (cnt < len && a.charAt(cnt) == b.charAt(cnt)) {
            cnt++;
        }
        return cnt;
    }

    public int[] longestCommonPrefix(String[] words) {
        int n = words.length;
        int[] ans = new int[n];
        if (n <= 1) {
            return ans;
        }
        int[] lcp = new int[n - 1];
        for (int i = 0; i + 1 < n; i++) {
            lcp[i] = solve(words[i], words[i + 1]);
        }
        int[] prefmax = new int[n - 1];
        int[] sufmax = new int[n - 1];
        prefmax[0] = lcp[0];
        for (int i = 1; i < n - 1; i++) {
            prefmax[i] = Math.max(prefmax[i - 1], lcp[i]);
        }
        sufmax[n - 2] = lcp[n - 2];
        for (int i = n - 3; i >= 0; i--) {
            sufmax[i] = Math.max(sufmax[i + 1], lcp[i]);
        }
        for (int i = 0; i < n; i++) {
            int best = 0;
            if (i >= 2) {
                best = Math.max(best, prefmax[i - 2]);
            }
            if (i + 1 <= n - 2) {
                best = Math.max(best, sufmax[i + 1]);
            }
            if (i > 0 && i < n - 1) {
                best = Math.max(best, solve(words[i - 1], words[i + 1]));
            }
            ans[i] = best;
        }
        return ans;
    }
}
