package g0101_0200.s0105_construct_binary_tree_from_preorder_and_inorder_traversal;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Hash_Table #Tree #Binary_Tree
// #Divide_and_Conquer #Data_Structure_II_Day_15_Tree #Big_O_Time_O(N)_Space_O(N)
// #2022_06_22_Time_3_ms_(86.35%)_Space_45.2_MB_(14.09%)

import com_github_leetcode.TreeNode;
import java.util.HashMap;
import java.util.Map;

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
    private int j;
    private Map<Integer, Integer> map = new HashMap<>();

    public int get(int key) {
        return map.get(key);
    }

    private TreeNode answer(int[] preorder, int[] inorder, int start, int end) {
        if (start > end || j > preorder.length) {
            return null;
        }
        int value = preorder[j++];
        int index = get(value);
        TreeNode node = new TreeNode(value);
        node.left = answer(preorder, inorder, start, index - 1);
        node.right = answer(preorder, inorder, index + 1, end);
        return node;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        j = 0;
        for (int i = 0; i < preorder.length; i++) {
            map.put(inorder[i], i);
        }
        return answer(preorder, inorder, 0, preorder.length - 1);
    }
}
