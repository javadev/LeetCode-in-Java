package g1401_1500.s1457_pseudo_palindromic_paths_in_a_binary_tree;

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree #Bit_Manipulation
// #2022_03_28_Time_35_ms_(43.73%)_Space_109.2_MB_(42.57%)

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
    private int ans;
    private int[] arr;

    public int pseudoPalindromicPaths(TreeNode root) {
        ans = 0;
        arr = new int[10];
        path(root);
        return ans;
    }

    private int isPalidrome() {
        int c = 0;
        int s = 0;
        for (int i = 0; i < 10; i++) {
            s += arr[i];
            if (arr[i] % 2 != 0) {
                c++;
            }
        }
        if (s % 2 == 0) {
            return c == 0 ? 1 : 0;
        }
        return c <= 1 ? 1 : 0;
    }

    private void path(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            arr[root.val]++;
            ans += isPalidrome();
            arr[root.val]--;
            return;
        }
        arr[root.val]++;
        path(root.left);
        path(root.right);
        arr[root.val]--;
    }
}
