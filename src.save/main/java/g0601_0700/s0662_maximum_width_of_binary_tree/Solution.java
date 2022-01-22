package g0601_0700.s0662_maximum_width_of_binary_tree;

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree

import com_github_leetcode.TreeNode;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Solution {
    static class Pair {
        TreeNode node;
        int idx;

        public Pair(TreeNode node, int idx) {
            this.node = node;
            this.idx = idx;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int res = 1;
        while (!q.isEmpty()) {
            int qSize = q.size();
            int lastIdx = 0;
            int firstIdx = 0;
            for (int i = 0; i < qSize; i++) {
                Pair temp = q.poll();
                if (i == 0) {
                    firstIdx = temp.idx;
                }
                if (i == qSize - 1) {
                    lastIdx = Objects.requireNonNull(temp).idx;
                }
                if (Objects.requireNonNull(temp).node.left != null) {
                    q.add(new Pair(temp.node.left, 2 * (temp.idx) + 1));
                }
                if (temp.node.right != null) {
                    q.add(new Pair(temp.node.right, 2 * (temp.idx) + 2));
                }
            }
            res = Math.max((lastIdx - firstIdx) + 1, res);
        }
        return res;
    }
}
