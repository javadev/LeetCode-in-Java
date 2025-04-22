package g3501_3600.s3525_find_x_value_of_array_ii;

// #Hard #Array #Math #Segment_Tree #2025_04_22_Time_202_ms_(67.11%)_Space_90.39_MB_(46.98%)

public class Solution {
    private int k;
    private Node[] seg;
    private int[] nums;

    private class Node {
        int prod;
        int[] cnt;

        Node() {
            prod = 1 % k;
            cnt = new int[k];
        }
    }

    private Node merge(Node l, Node r) {
        Node p = new Node();
        p.prod = (l.prod * r.prod) % k;
        for (int i = 0; i < k; i++) {
            p.cnt[i] = l.cnt[i];
        }
        for (int t = 0; t < k; t++) {
            int w = (l.prod * t) % k;
            p.cnt[w] += r.cnt[t];
        }
        return p;
    }

    private void build(int idx, int l, int r) {
        if (l == r) {
            Node nd = new Node();
            int v = nums[l] % k;
            nd.prod = v;
            nd.cnt[v] = 1;
            seg[idx] = nd;
        } else {
            int m = (l + r) >>> 1;
            build(idx << 1, l, m);
            build(idx << 1 | 1, m + 1, r);
            seg[idx] = merge(seg[idx << 1], seg[idx << 1 | 1]);
        }
    }

    private void update(int idx, int l, int r, int pos, int val) {
        if (l == r) {
            Node nd = new Node();
            int v = val % k;
            nd.prod = v;
            nd.cnt[v] = 1;
            seg[idx] = nd;
        } else {
            int m = (l + r) >>> 1;
            if (pos <= m) {
                update(idx << 1, l, m, pos, val);
            } else {
                update(idx << 1 | 1, m + 1, r, pos, val);
            }
            seg[idx] = merge(seg[idx << 1], seg[idx << 1 | 1]);
        }
    }

    private Node query(int idx, int l, int r, int ql, int qr) {
        if (ql <= l && r <= qr) {
            return seg[idx];
        }
        int m = (l + r) >>> 1;
        if (qr <= m) {
            return query(idx << 1, l, m, ql, qr);
        }
        if (ql > m) {
            return query(idx << 1 | 1, m + 1, r, ql, qr);
        }
        return merge(query(idx << 1, l, m, ql, qr), query(idx << 1 | 1, m + 1, r, ql, qr));
    }

    public int[] resultArray(int[] nums, int k, int[][] queries) {
        int n = nums.length;
        this.k = k;
        this.nums = nums;
        seg = new Node[4 * n];
        build(1, 0, n - 1);
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int idx0 = queries[i][0];
            int val = queries[i][1];
            int start = queries[i][2];
            int x = queries[i][3];
            update(1, 0, n - 1, idx0, val);
            Node res = query(1, 0, n - 1, start, n - 1);
            ans[i] = res.cnt[x];
        }
        return ans;
    }
}
