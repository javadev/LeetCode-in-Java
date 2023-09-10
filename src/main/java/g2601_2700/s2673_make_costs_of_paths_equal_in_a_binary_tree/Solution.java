package g2601_2700.s2673_make_costs_of_paths_equal_in_a_binary_tree;

// #Medium #Array #Dynamic_Programming #Greedy #Tree #Binary_Tree
// #2023_09_10_Time_4_ms_(96.98%)_Space_55.3_MB_(45.28%)

public class Solution {
    public int minIncrements(int n, int[] cost) {
        int last = n / 2 - 1;
        int res = 0;
        for (int i = last; i >= 0; i--) {
            int abs = cost[2 * i + 1] - cost[2 * i + 2];
            if (abs < 0) {
                abs *= -1;
            }
            cost[i] += Math.max(cost[2 * i + 1], cost[2 * i + 2]);
            res += abs;
        }
        return res;
    }
}
