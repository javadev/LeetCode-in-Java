package g0001_0100.s0095_unique_binary_search_trees_ii;

// #Medium #Dynamic_Programming #Tree #Binary_Tree #Backtracking #Binary_Search_Tree
// #2022_06_21_Time_1_ms_(99.82%)_Space_45.7_MB_(66.23%)

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
import java.util.List;

/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> result = new ArrayList<>();
        result.add(new TreeNode(1));
        for (int i = 2; i <= n; i++) {
            List<TreeNode> nresult = new ArrayList<>();
            for (TreeNode r : result) {
                TreeNode node = new TreeNode(i, r, null);
                nresult.add(node);

                TreeNode previous = r;
                while (previous != null) {
                    node = new TreeNode(i);
                    TreeNode cr = copy(r);
                    insert(cr, node, previous);
                    previous = node.left;
                    nresult.add(cr);
                }
            }
            result = nresult;
        }
        return result;
    }

    private void insert(TreeNode dest, TreeNode n, TreeNode from) {
        if (dest.val == from.val) {
            TreeNode h = dest.right;
            dest.right = n;
            n.left = h;
            return;
        }
        insert(dest.right, n, from);
    }

    private TreeNode copy(TreeNode n) {
        if (n == null) {
            return null;
        }
        return new TreeNode(n.val, copy(n.left), copy(n.right));
    }
}
