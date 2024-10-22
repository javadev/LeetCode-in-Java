package g3301_3400.s3327_check_if_dfs_strings_are_palindromes;

// #Hard #Array #String #Hash_Table #Tree #Hash_Function #Depth_First_Search
// #2024_10_22_Time_159_ms_(90.40%)_Space_93.9_MB_(80.80%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private final List<List<Integer>> e = new ArrayList<>();
    private final StringBuilder stringBuilder = new StringBuilder();
    private String s;
    private int now;
    private int n;
    private int[] l;
    private int[] r;
    private int[] p;
    private char[] c;

    private void dfs(int x) {
        l[x] = now + 1;
        for (int v : e.get(x)) {
            dfs(v);
        }
        stringBuilder.append(s.charAt(x));
        r[x] = ++now;
    }

    private void manacher() {
        c[0] = '~';
        c[1] = '#';
        for (int i = 1; i <= n; ++i) {
            c[2 * i + 1] = '#';
            c[2 * i] = stringBuilder.charAt(i - 1);
        }
        for (int i = 1, mid = 0, r = 0; i <= 2 * n + 1; ++i) {
            if (i <= r) p[i] = Math.min(p[(mid << 1) - i], r - i + 1);
            while (c[i - p[i]] == c[i + p[i]]) ++p[i];
            if (p[i] + i > r) {
                r = p[i] + i - 1;
                mid = i;
            }
        }
    }

    public boolean[] findAnswer(int[] parent, String s) {
        n = parent.length;
        this.s = s;
        for (int i = 0; i < n; ++i) {
            e.add(new ArrayList<>());
        }
        for (int i = 1; i < n; ++i) {
            e.get(parent[i]).add(i);
        }
        l = new int[n];
        r = new int[n];
        dfs(0);
        c = new char[2 * n + 10];
        p = new int[2 * n + 10];
        manacher();
        boolean[] ans = new boolean[n];
        for (int i = 0; i < n; ++i) {
            int mid = (2 * r[i] - 2 * l[i] + 1) / 2 + 2 * l[i];
            ans[i] = p[mid] - 1 >= r[i] - l[i] + 1;
        }
        return ans;
    }
}
