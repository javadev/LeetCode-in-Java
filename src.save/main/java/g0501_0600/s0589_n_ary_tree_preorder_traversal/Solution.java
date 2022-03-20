package g0501_0600.s0589_n_ary_tree_preorder_traversal;

// #Easy #Depth_First_Search #Tree #Stack #Programming_Skills_I_Day_5_Function
// #2022_03_20_Time_2_ms_(54.35%)_Space_46.3_MB_(34.84%)

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
