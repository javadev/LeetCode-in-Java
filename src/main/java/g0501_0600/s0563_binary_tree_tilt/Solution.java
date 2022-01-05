package g0501_0600.s0563_binary_tree_tilt;

// #Easy #Depth_First_Search #Tree #Binary_Tree

import com_github_leetcode.TreeNode;

public class Solution {
    private int sum=0;
    private int sumTilt(TreeNode root){
        if(root==null)return 0;
        int ls=sumTilt(root.left);
        int rs=sumTilt(root.right);
        sum+=Math.abs(ls-rs);
        return ls+rs+root.val;
    }
    public int findTilt(TreeNode root) {
        sum=0;
        sumTilt(root);
        return sum;
    }
}