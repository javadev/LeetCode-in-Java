package g0101_0200.s0108_convert_sorted_array_to_binary_search_tree;

// #Easy #Top_Interview_Questions #Array #Tree #Binary_Tree #Binary_Search_Tree #Divide_and_Conquer
// #Data_Structure_II_Day_15_Tree #Level_2_Day_9_Binary_Search_Tree #Udemy_Tree_Stack_Queue
// #2022_06_22_Time_0_ms_(100.00%)_Space_43.9_MB_(32.26%)

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
    public TreeNode sortedArrayToBST(int[] num) {
        /*1. Set up recursion*/
        return makeTree(num, 0, num.length - 1);
    }

    private TreeNode makeTree(int[] num, int left, int right) {
        /*2. left as lowest# can't be greater than right*/
        if (left > right) {
            return null;
        }
        /*3. Set median# as node*/
        int mid = (left + right) / 2;
        TreeNode midNode = new TreeNode(num[mid]);
        /*4. Set mid node's kids*/
        midNode.left = makeTree(num, left, mid - 1);
        midNode.right = makeTree(num, mid + 1, right);
        /*5. Sends node back || Goes back to prev node*/
        return midNode;
    }
}
