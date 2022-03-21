package g1301_1400.s1382_balance_a_binary_search_tree;

// #Medium #Depth_First_Search #Greedy #Tree #Binary_Tree #Binary_Search_Tree #Divide_and_Conquer
// #2022_03_21_Time_5_ms_(65.24%)_Space_63_MB_(9.20%)

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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> inorder = inorder(root, new ArrayList<>());
        return dfs(inorder, 0, inorder.size() - 1);
    }

    private List<Integer> inorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return list;
        }
        inorder(root.left, list);
        list.add(root.val);
        return inorder(root.right, list);
    }

    private TreeNode dfs(List<Integer> nums, int start, int end) {
        if (end < start) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums.get(mid));
        root.left = dfs(nums, start, mid - 1);
        root.right = dfs(nums, mid + 1, end);
        return root;
    }
}
