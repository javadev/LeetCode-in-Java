package com_github_leetcode;

@SuppressWarnings("java:S1104")
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {}

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    private static int index = 0;

    public static TreeNode create(int[] arr) {
        index = 0;
        return create1(arr);
    }

    private static TreeNode create1(int[] arr) {
        if (arr.length == index) {
            return null;
        }
        if (arr[index] == '#') {
            index++;
            return null;
        } else {
            TreeNode res = new TreeNode(arr[index++]);
            res.left = create1(arr);
            res.right = create1(arr);
            return res;
        }
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
