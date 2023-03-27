package g0901_1000.s0968_binary_tree_cameras;

// #Hard #Dynamic_Programming #Depth_First_Search #Tree #Binary_Tree #Udemy_Tree_Stack_Queue
// #2022_03_31_Time_0_ms_(100.00%)_Space_41.4_MB_(98.84%)

import com_github_leetcode.TreeNode;

/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    private int cameras;

    public int minCameraCover(TreeNode root) {
        cameras = 0;
        if (minCameras(root) == -1) {
            // root needs a camera
            cameras++;
        }
        return cameras;
    }

    //  States =>
    // -1 : Node needs a camera
    //  0 : Node has a camera placed
    //  1 : Node is covered somehow
    private int minCameras(TreeNode root) {
        if (root == null) {
            return 1;
        }
        int leftChildState = minCameras(root.left);
        int rightChildState = minCameras(root.right);
        // One of the two or both children need a camera
        if (leftChildState == -1 || rightChildState == -1) {
            // installed
            cameras++;
            return 0;
        }
        // One of the two or both children have a camera placed
        if (leftChildState == 0 || rightChildState == 0) {
            // gets covered by the children
            return 1;
        }
        // needs a camera
        return -1;
    }
}
