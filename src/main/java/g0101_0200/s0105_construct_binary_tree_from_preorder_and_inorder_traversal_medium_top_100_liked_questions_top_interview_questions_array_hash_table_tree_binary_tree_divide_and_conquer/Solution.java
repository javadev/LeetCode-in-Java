package g0101_0200.s0105_construct_binary_tree_from_preorder_and_inorder_traversal_medium_top_100_liked_questions_top_interview_questions_array_hash_table_tree_binary_tree_divide_and_conquer;

import com_github_leetcode.TreeNode;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    int j;
    Map<Integer, Integer> map = new HashMap<>();

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
