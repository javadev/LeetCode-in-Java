package com_github_leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeUtils {
    /*
    * This method is to construct a normal binary tree. The input reads like
    * this for [5, 3, 6, 2, 4, null, null, 1], i.e. preorder:
                   5
                 /   \
                3     6
               / \    / \
              2   4  #   #
             /
            1
    */
    public static TreeNode constructBinaryTree(List<Integer> treeValues) {
        TreeNode root = new TreeNode(treeValues.get(0));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        for (int i = 1; i < treeValues.size(); i++) {
            TreeNode curr = queue.poll();
            if (treeValues.get(i) != null) {
                curr.left = new TreeNode(treeValues.get(i));
                queue.offer(curr.left);
            }
            if (++i < treeValues.size() && treeValues.get(i) != null) {
                curr.right = new TreeNode(treeValues.get(i));
                queue.offer(curr.right);
            }
        }
        return root;
    }
}
