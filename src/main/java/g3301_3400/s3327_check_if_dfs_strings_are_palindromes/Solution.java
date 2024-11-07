package g3301_3400.s3327_check_if_dfs_strings_are_palindromes;

// #Hard #Array #String #Hash_Table #Depth_First_Search #Tree #Hash_Function
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

    private void matcher() {
        c[0] = '~';
        c[1] = '#';
        for (int i = 1; i <= n; ++i) {
            c[2 * i + 1] = '#';
            c[2 * i] = stringBuilder.charAt(i - 1);
        }
        int j = 1;
        int mid = 0;
        int localR = 0;
        while (j <= 2 * n + 1) {
            if (j <= localR) {
                p[j] = Math.min(p[(mid << 1) - j], localR - j + 1);
            }
            while (c[j - p[j]] == c[j + p[j]]) {
                ++p[j];
            }
            if (p[j] + j > localR) {
                localR = p[j] + j - 1;
                mid = j;
            }
            ++j;
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
        matcher();
        boolean[] ans = new boolean[n];
        for (int i = 0; i < n; ++i) {
            int mid = (2 * r[i] - 2 * l[i] + 1) / 2 + 2 * l[i];
            ans[i] = p[mid] - 1 >= r[i] - l[i] + 1;
        }
        return ans;
    }
}
