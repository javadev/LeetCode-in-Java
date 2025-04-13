package g0101_0200.s0104_maximum_depth_of_binary_tree;

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Depth_First_Search #Breadth_First_Search
// #Tree #Binary_Tree #LeetCode_75_Binary_Tree/DFS #Data_Structure_I_Day_11_Tree
// #Programming_Skills_I_Day_10_Linked_List_and_Tree #Udemy_Tree_Stack_Queue
// #Top_Interview_150_Binary_Tree_General #Big_O_Time_O(N)_Space_O(H)
// #2024_11_13_Time_0_ms_(100.00%)_Space_42.2_MB_(88.11%)

import com_github_leetcode.TreeNode;

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
    public int maxDepth(TreeNode root) {
        return findDepth(root, 0);
    }

    private int findDepth(TreeNode node, int currentDepth) {
        if (node == null) {
            return 0;
        }
        currentDepth++;
        return 1
                + Math.max(findDepth(node.left, currentDepth), findDepth(node.right, currentDepth));
    }
}
