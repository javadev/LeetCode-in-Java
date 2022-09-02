package g1701_1800.s1766_tree_of_coprimes;

// #Hard #Math #Depth_First_Search #Breadth_First_Search #Tree
// #2022_04_30_Time_111_ms_(94.07%)_Space_155.4_MB_(40.68%)

import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings({"unchecked", "java:S107"})
public class Solution {
    private void dfs(
            int[] v2n,
            int[] v2d,
            int depth,
            int parent,
            int node,
            int[] ans,
            int[] nums,
            ArrayList<Integer>[] neighbors) {
        int d = Integer.MIN_VALUE;
        int n = -1;
        int v = nums[node];
        for (int i = 1; i <= 50; i++) {
            if (v2n[i] != -1 && v2d[i] > d && gcd(i, v) == 1) {
                d = v2d[i];
                n = v2n[i];
            }
        }
        ans[node] = n;
        int v2NOld = v2n[v];
        int v2DOld = v2d[v];
        v2n[v] = node;
        v2d[v] = depth;
        for (int child : neighbors[node]) {
            if (child == parent) {
                continue;
            }
            dfs(v2n, v2d, depth + 1, node, child, ans, nums, neighbors);
        }
        v2n[v] = v2NOld;
        v2d[v] = v2DOld;
    }

    private int gcd(int x, int y) {
        return x == 0 ? y : gcd(y % x, x);
    }

    public int[] getCoprimes(int[] nums, int[][] edges) {
        int n = nums.length;
        ArrayList<Integer>[] neighbors = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            neighbors[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            neighbors[edge[0]].add(edge[1]);
            neighbors[edge[1]].add(edge[0]);
        }
        int[] ans = new int[n];
        int[] v2n = new int[51];
        int[] v2d = new int[51];
        Arrays.fill(v2n, -1);
        dfs(v2n, v2d, 0, -1, 0, ans, nums, neighbors);
        return ans;
    }
}
