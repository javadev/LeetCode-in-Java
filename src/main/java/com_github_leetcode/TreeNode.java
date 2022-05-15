package com_github_leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@SuppressWarnings("java:S1104")
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode create(List<Integer> treeValues) {
        TreeNode root = treeValues.isEmpty() ? null : new TreeNode(treeValues.get(0));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;
        while (i < treeValues.size()) {
            TreeNode curr = queue.poll();
            if (treeValues.get(i) != null) {
                curr.left = new TreeNode(treeValues.get(i));
                queue.offer(curr.left);
            }
            if (++i < treeValues.size() && treeValues.get(i) != null) {
                curr.right = new TreeNode(treeValues.get(i));
                queue.offer(curr.right);
            }
            i++;
        }
        return root;
    }

    public String toString() {
        if (left == null && right == null) {
            return "" + val;
        } else {
            String root = "" + val;
            String leftValue = "null";
            String rightValue = "null";
            if (left != null) {
                leftValue = left.toString();
            }
            if (right != null) {
                rightValue = right.toString();
            }
            return root + "," + leftValue + "," + rightValue;
        }
    }
}
