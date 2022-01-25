package g0501_0600.s0501_find_mode_in_binary_search_tree;

// #Easy #Depth_First_Search #Tree #Binary_Tree #Binary_Search_Tree

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    private Integer prev = null;
    private int max = 0;
    private int cnt = 1;

    public int[] findMode(TreeNode root) {
        ArrayList<Integer> modes = new ArrayList<>();
        traverse(root, modes);
        int[] res = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            res[i] = modes.get(i);
        }
        return res;
    }

    private void traverse(TreeNode root, List<Integer> modes) {
        if (root == null) {
            return;
        }
        traverse(root.left, modes);
        if (prev != null) {
            if (prev == root.val) {
                cnt++;
            } else {
                cnt = 1;
            }
        }
        if (cnt > max) {
            max = cnt;
            modes.clear();
            modes.add(root.val);
        } else if (cnt == max) {
            modes.add(root.val);
        }
        prev = root.val;
        traverse(root.right, modes);
    }
}
