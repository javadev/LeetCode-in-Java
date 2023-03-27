package g1201_1300.s1261_find_elements_in_a_contaminated_binary_tree;

// #Medium #Hash_Table #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree #Design
// #2022_03_13_Time_24_ms_(84.00%)_Space_57.1_MB_(10.00%)

import com_github_leetcode.TreeNode;
import java.util.HashMap;

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
public class FindElements {
    private final HashMap<Integer, Integer> map = new HashMap<>();

    public FindElements(TreeNode root) {
        helper(root, 0);
    }

    private void helper(TreeNode root, int x) {
        if (root == null) {
            return;
        }
        root.val = x;
        map.put(x, 0);
        helper(root.left, 2 * x + 1);
        helper(root.right, 2 * x + 2);
    }

    public boolean find(int target) {
        return map.containsKey(target);
    }
}

/*
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */
