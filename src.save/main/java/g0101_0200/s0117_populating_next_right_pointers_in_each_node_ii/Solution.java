package g0101_0200.s0117_populating_next_right_pointers_in_each_node_ii;

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2022_02_22_Time_0_ms_(100.00%)_Space_42.2_MB_(42.40%)

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
        if (root.left == null && root.right == null) {
            return root;
        }

        if (root.left != null) {
            if (root.right != null) {
                root.left.next = root.right;
            } else if (root.next != null) {
                root.left.next = adjacentRightNode(root.next);
            }
        }
        if (root.right != null) {
            root.right.next = adjacentRightNode(root.next);
        }
        connect(root.right);
        connect(root.left);
        return root;
    }

    private Node adjacentRightNode(Node root) {
        Node temp = root;
        while (temp != null) {
            if (temp.left == null && temp.right == null) {
                temp = temp.next;
            } else {
                if (temp.left != null) {
                    return temp.left;
                }
                if (temp.right != null) {
                    return temp.right;
                }
            }
        }
        return null;
    }
}
