package g4001_4100.s4015_weighted_sum_of_a_tree;

// #Medium #Array #Depth_First_Search #Tree #Senior #Weekly_Contest_514
// #2026_11_19_Time_5_ms_(100.00%)_Space_107.29_MB_(94.38%)

public class Solution {
    public long weightedSum(int[] parent, int[] nums) {
        int n = parent.length;
        int[] depth = new int[n];
        depth[0] = 1;
        for (int i = 1; i < n; i++) {
            if (depth[i] != 0) {
                continue;
            }
            int currDepth = getDepth(parent, depth, i);
            int curr = i;
            while (depth[curr] == 0) {
                depth[curr] = currDepth;
                curr = parent[curr];
                currDepth -= 1;
            }
        }
        long res = 0;
        int height = 0;
        for (int i = 0; i < n; i++) {
            height = Math.max(height, depth[i]);
        }
        for (int i = 0; i < n; i++) {
            res += (long) (height - depth[i] + 1) * nums[i];
        }
        return res;
    }

    private int getDepth(int[] parent, int[] currDepth, int node) {
        int add = 0;
        while (currDepth[node] == 0) {
            node = parent[node];
            add += 1;
        }
        return currDepth[node] + add;
    }
}
