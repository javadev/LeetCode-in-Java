package g0101_0200.s0107_binary_tree_level_order_traversal_ii;

// #Medium #Breadth_First_Search #Tree #Binary_Tree
// #2022_02_21_Time_1_ms_(93.94%)_Space_43.5_MB_(20.70%)

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    private List<List<Integer>> order = new ArrayList<>();

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        getOrder(root, 0);
        Collections.reverse(order);
        return order;
    }

    public void getOrder(TreeNode root, int level) {
        if (root != null) {
            if (level + 1 > order.size()) {
                order.add(new ArrayList<>());
            }
            order.get(level).add(root.val);
            getOrder(root.left, level + 1);
            getOrder(root.right, level + 1);
        }
    }
}
