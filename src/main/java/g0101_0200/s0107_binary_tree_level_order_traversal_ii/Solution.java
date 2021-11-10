package g0101_0200.s0107_binary_tree_level_order_traversal_ii;

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    List<List<Integer>> order = new ArrayList<>();

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        getOrder(root, 0);
        Collections.reverse(order);
        return order;
    }

    public void getOrder(TreeNode root, int level) {
        if (root == null) {
            return;
        } else {
            if (level + 1 > order.size()) {
                order.add(new ArrayList<>());
            }
            order.get(level).add(root.val);
            getOrder(root.left, level + 1);
            getOrder(root.right, level + 1);
        }
    }
}
