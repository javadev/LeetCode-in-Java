package g0401_0500.s0429_n_ary_tree_level_order_traversal;

// #Medium #Breadth_First_Search #Tree #Acceptance_68.9% #Programming_Skills_II_Day_9
// #2022_03_18_Time_4_ms_(57.07%)_Space_47.6_MB_(23.92%)

import com_github_leetcode.Node;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node currentNode = queue.poll();
                if (currentNode != null) {
                    level.add(currentNode.val);
                    for (Node child : currentNode.neighbors) {
                        queue.offer(child);
                    }
                }
            }
            result.add(level);
        }
        return result;
    }
}
