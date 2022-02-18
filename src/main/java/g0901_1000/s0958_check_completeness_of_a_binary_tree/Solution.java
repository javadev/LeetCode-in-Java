package g0901_1000.s0958_check_completeness_of_a_binary_tree;

// #Medium #Breadth_First_Search #Tree #Binary_Tree
// #2022_02_18_Time_2_ms_(43.56%)_Space_42.6_MB_(18.09%)

import com_github_leetcode.TreeNode;
import java.util.LinkedList;

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
    public boolean isCompleteTree(TreeNode root) {
        /* 1. Tree no exist? complete! */
        if (root == null) {
            return true;
        }
        /* 2. Create a queue for purposeful sequence of inserting children nodes
        //   (Left to right, level by level)  */
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        /* 3. Essential for our loop. Checks if we seen a null. */
        boolean seenNull = false;
        /* 4. While the queue isn't empty.
        //   Catch that null, and if there is a # after, it's not complete */
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                seenNull = true;
            } else {
                if (seenNull) {
                    return false;
                }
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        /*5. If we don't catch null with # after: it's complete */
        return true;
    }
}
