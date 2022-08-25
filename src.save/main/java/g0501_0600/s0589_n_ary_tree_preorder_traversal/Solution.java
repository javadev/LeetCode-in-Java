package g0501_0600.s0589_n_ary_tree_preorder_traversal;

// #Easy #Depth_First_Search #Tree #Stack #Programming_Skills_I_Day_5_Function #Level_1_Day_6_Tree
// #2022_08_25_Time_1_ms_(90.98%)_Space_45.4_MB_(83.13%)

import com_github_leetcode.Node;
import java.util.ArrayList;
import java.util.List;

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};
*/
public class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        preorderHelper(res, root);
        return res;
    }

    private void preorderHelper(List<Integer> res, Node root) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        for (Node node : root.neighbors) {
            preorderHelper(res, node);
        }
    }
}
