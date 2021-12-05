package g0101_0200.s0116_populating_next_right_pointers_in_each_node_medium_top_interview_questions_depth_first_search_breadth_first_search_tree_binary_tree;

import com_github_leetcode.left_right.Node;

/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

public class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        if (root.left != null && root.right != null) {
            root.left.next = root.right;
        }
        if (root.next != null && root.right != null) {
            root.right.next = root.next.left;
        }
        connect(root.left);
        connect(root.right);
        return root;
    }
}
