package g3601_3700.s3660_jump_game_ix;

// #Medium #Weekly_Contest_464 #2025_08_24_Time_248_ms_(100.00%)_Space_72.98_MB_(100.00%)

import java.util.ArrayDeque;
import java.util.HashMap;

public class Solution {
    public int[] maxValue(int[] nums) {
        int n = nums.length;
        ArrayDeque<Integer> st = new ArrayDeque<>();
        UnionFind uf = new UnionFind(n);
        for (int i = 0; i < n; i++) {
            int prev = i;
            if (!st.isEmpty()) {
                prev = st.peek();
            }
            while (!st.isEmpty() && nums[i] < nums[st.peek()]) {
                uf.union(st.pop(), i);
            }
            if (nums[i] > nums[prev]) {
                st.push(i);
            } else {
                st.push(prev);
            }
        }
        st.clear();
        for (int i = n - 1; i >= 0; i--) {
            int prev = i;
            if (!st.isEmpty()) {
                prev = st.peek();
            }
            while (!st.isEmpty() && nums[i] > nums[st.peek()]) {
                uf.union(st.pop(), i);
            }
            if (nums[i] < nums[prev]) {
                st.push(i);
            } else {
                st.push(prev);
            }
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int root = uf.find(i);
            map.put(root, Math.max(map.getOrDefault(root, Integer.MIN_VALUE), nums[i]));
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = map.get(uf.find(i));
        }
        return ans;
    }

    private static class UnionFind {
        int[] par;
        int[] rank;

        UnionFind(int n) {
            par = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                par[i] = i;
            }
        }

        int find(int x) {
            if (par[x] != x) {
                par[x] = find(par[x]);
            }
            return par[x];
        }

        void union(int x, int y) {
            x = find(x);
            y = find(y);
            if (x == y) {
                return;
            }
            if (rank[x] < rank[y]) {
                par[x] = y;
            } else if (rank[x] > rank[y]) {
                par[y] = x;
            } else {
                par[y] = x;
                rank[x]++;
            }
        }
    }
}
