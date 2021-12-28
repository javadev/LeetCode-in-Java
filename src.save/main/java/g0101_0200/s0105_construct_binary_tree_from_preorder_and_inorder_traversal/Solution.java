package g0101_0200.s0105_construct_binary_tree_from_preorder_and_inorder_traversal;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Hash_Table #Tree #Binary_Tree
// #Divide_and_Conquer

import com_github_leetcode.TreeNode;
import java.util.HashMap;
import java.util.Map;

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
