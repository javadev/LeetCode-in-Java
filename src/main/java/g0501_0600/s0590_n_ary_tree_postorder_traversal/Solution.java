package g0501_0600.s0590_n_ary_tree_postorder_traversal;

// #Easy #Depth_First_Search #Tree #Stack #2022_03_20_Time_0_ms_(100.00%)_Space_42.9_MB_(90.33%)

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
    private List<Integer> ans;

    public List<Integer> postorder(Node root) {
        ans = new ArrayList<>();
        recursion(root);
        if (root != null) {
            ans.add(root.val);
        }
        return ans;
    }

    private void recursion(Node root) {
        if (root == null) {
            return;
        }
        for (Node child : root.neighbors) {
            recursion(child);
            ans.add(child.val);
        }
    }
}
