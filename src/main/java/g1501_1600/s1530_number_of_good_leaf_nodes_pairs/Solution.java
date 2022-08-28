package g1501_1600.s1530_number_of_good_leaf_nodes_pairs;

// #Medium #Depth_First_Search #Tree #Binary_Tree
// #2022_04_09_Time_3_ms_(94.18%)_Space_52.2_MB_(60.26%)

import com_github_leetcode.TreeNode;

public class Solution {
    public int countPairs(TreeNode root, int distance) {
        if (distance < 2) {
            return 0;
        }
        return pairsAndLeaves(root, distance)[0];
    }

    private int[] pairsAndLeaves(TreeNode node, int distance) {
        int[] r = new int[distance];
        if (node == null) {
            return r;
        }
        if (node.left == null && node.right == null) {
            r[1] = 1;
            return r;
        }
        int[] rl = pairsAndLeaves(node.left, distance);
        int[] rr = pairsAndLeaves(node.right, distance);
        for (int i = 2; i < distance; i++) {
            r[i] = rl[i - 1] + rr[i - 1];
        }
        int pairs = rl[0] + rr[0];
        for (int dist = 2; dist <= distance; dist++) {
            for (int leftToNodeDist = 1; leftToNodeDist < dist; leftToNodeDist++) {
                pairs += rl[leftToNodeDist] * rr[dist - leftToNodeDist];
            }
        }
        r[0] = pairs;
        return r;
    }
}
