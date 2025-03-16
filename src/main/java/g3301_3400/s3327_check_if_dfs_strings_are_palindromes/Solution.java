package g3301_3400.s3327_check_if_dfs_strings_are_palindromes;

// #Hard #Array #String #Hash_Table #Depth_First_Search #Tree #Hash_Function
// #2025_03_16_Time_70_ms_(100.00%)_Space_75.50_MB_(96.67%)

public class Solution {
    private int time = 0;
    private byte[] cs;
    private int[][] graph;

    public boolean[] findAnswer(int[] parent, String s) {
        int n = s.length();
        cs = s.getBytes();
        graph = new int[n][];
        final int[] childCount = new int[n];
        for (int i = 1; i < n; i++) {
            childCount[parent[i]]++;
        }
        for (int i = 0; i < n; i++) {
            graph[i] = new int[childCount[i]];
            childCount[i] = 0;
        }
        for (int i = 1; i < n; i++) {
            graph[parent[i]][childCount[parent[i]]++] = i;
        }
        byte[] dfsStr = new byte[n];
        int[] start = new int[n];
        int[] end = new int[n];
        dfs(0, dfsStr, start, end);
        int[] lens = getRadius(dfsStr);
        boolean[] ans = new boolean[n];
        for (int i = 0; i < n; i++) {
            int l = start[i];
            int r = end[i];
            int center = l + r + 2;
            ans[i] = lens[center] >= r - l + 1;
        }
        return ans;
    }

    private void dfs(int u, byte[] dfsStr, int[] start, int[] end) {
        start[u] = time;
        for (int v : graph[u]) {
            dfs(v, dfsStr, start, end);
        }
        dfsStr[time] = cs[u];
        end[u] = time++;
    }

    private int[] getRadius(byte[] cs) {
        int n = cs.length;
        byte[] t = new byte[2 * n + 3];
        int m = 0;
        t[m++] = '@';
        t[m++] = '#';
        for (byte c : cs) {
            t[m++] = c;
            t[m++] = '#';
        }
        t[m++] = '$';
        int[] lens = new int[m];
        int center = 0;
        int right = 0;
        for (int i = 2; i < m - 2; i++) {
            int len = 0;
            if (i < right) {
                len = Math.min(lens[2 * center - i], right - i);
            }
            while (t[i + len + 1] == t[i - len - 1]) {
                len++;
            }
            if (right < i + len) {
                right = i + len;
                center = i;
            }
            lens[i] = len;
        }
        return lens;
    }
}
