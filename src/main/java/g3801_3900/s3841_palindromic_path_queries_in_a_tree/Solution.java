package g3801_3900.s3841_palindromic_path_queries_in_a_tree;

// #Hard #Array #String #Tree #Bit_Manipulation #Divide_and_Conquer #Segment_Tree
// #Biweekly_Contest_176 #Principal #Depth_First_Search
// #2026_07_22_Time_65_ms_(100.00%)_Space_185.61_MB_(96.67%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private int[] head;
    private int[] to;
    private int[] next;

    private int[][] lift;
    private int[] first;
    private int[] last;
    private int[] depth;
    private int time = 0;
    private int maxPower;

    public List<Boolean> palindromePath(int n, int[][] edges, String s, String[] queries) {
        this.first = new int[n];
        this.last = new int[n];
        this.maxPower = 31 - Integer.numberOfLeadingZeros(n);
        this.depth = new int[n];
        this.lift = new int[maxPower + 1][n];
        int m = edges.length;
        this.head = new int[n];
        this.to = new int[m << 1];
        this.next = new int[m << 1];
        Arrays.fill(head, -1);
        for (int i = 0; i < m; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            to[i << 1] = b;
            next[i << 1] = head[a];
            head[a] = i << 1;
            to[i << 1 | 1] = a;
            next[i << 1 | 1] = head[b];
            head[b] = i << 1 | 1;
        }
        dfs(0, -1);
        BIT bit = new BIT(n + 1);
        char[] arr = s.toCharArray();
        for (int i = 0; i < n; i++) {
            bit.update(first[i], 1 << arr[i] - 'a');
            bit.update(last[i] + 1, 1 << arr[i] - 'a');
        }
        ArrayList<Boolean> list = new ArrayList<>(queries.length);
        for (String query : queries) {
            if (query.charAt(0) == 'u') {
                int i = Integer.parseInt(query.substring(7, query.length() - 2));
                char c = query.charAt(query.length() - 1);
                if (c == arr[i]) {
                    continue;
                }
                int filter = 1 << arr[i] - 'a' | 1 << c - 'a';
                bit.update(first[i], filter);
                arr[i] = c;
                bit.update(last[i] + 1, filter);
            } else {
                int i1 = query.indexOf(' ');
                int i2 = query.lastIndexOf(' ');
                int a = Integer.parseInt(query.substring(i1 + 1, i2));
                int b = Integer.parseInt(query.substring(i2 + 1));
                int r = bit.query(first[a]) ^ bit.query(first[b]) ^ 1 << arr[lca(a, b)] - 'a';
                list.add((r & r - 1) == 0);
            }
        }
        return list;
    }

    private int lca(int a, int b) {
        if (depth[a] > depth[b]) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (first[a] <= first[b] && last[a] >= last[b]) {
            return a;
        }
        int diff = depth[b] - depth[a];
        for (int i = maxPower; diff != 0; --i) {
            if (diff >= 1 << i) {
                b = lift[i][b];
                diff -= 1 << i;
            }
        }
        if (a == b) {
            return a;
        }
        for (int i = maxPower; i >= 0; --i) {
            if (lift[i][a] != lift[i][b]) {
                a = lift[i][a];
                b = lift[i][b];
            }
        }
        return lift[0][a];
    }

    private void dfs(int index, int prev) {
        first[index] = ++time;
        for (int x = head[index]; x != -1; x = next[x]) {
            int nextIndex = to[x];
            if (nextIndex == prev) {
                continue;
            }
            depth[nextIndex] = depth[index] + 1;
            lift[0][nextIndex] = index;
            for (int i = 1; (1 << i) < depth[nextIndex]; i++) {
                lift[i][nextIndex] = lift[i - 1][lift[i - 1][nextIndex]];
            }
            dfs(nextIndex, index);
        }
        last[index] = time;
    }

    private static class BIT {
        private final int[] ints;
        private final int n;

        BIT(int n) {
            this.n = n;
            this.ints = new int[n + 1];
        }

        public void update(int index, int val) {
            for (int i = index + 1; i <= n; i += i & -i) {
                ints[i] ^= val;
            }
        }

        public int query(int index) {
            int ans = 0;
            for (int i = index + 1; i > 0; i -= i & -i) {
                ans ^= ints[i];
            }
            return ans;
        }
    }
}
