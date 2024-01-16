package g2001_2100.s2096_step_by_step_directions_from_a_binary_tree_node_to_another;

// #Medium #String #Depth_First_Search #Tree #Binary_Tree
// #2022_05_25_Time_30_ms_(76.29%)_Space_109.4_MB_(43.13%)

import com_github_leetcode.TreeNode;

public class Solution {
    private boolean find(TreeNode n, int val, StringBuilder sb) {
        if (n.val == val) {
            return true;
        }
        if (n.left != null && find(n.left, val, sb)) {
            sb.append("L");
        } else if (n.right != null && find(n.right, val, sb)) {
            sb.append("R");
        }
        return sb.length() > 0;
    }

    public String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder s = new StringBuilder();
        StringBuilder d = new StringBuilder();
        find(root, startValue, s);
        find(root, destValue, d);
        int i = 0;
        int maxI = Math.min(d.length(), s.length());
        while (i < maxI && s.charAt(s.length() - i - 1) == d.charAt(d.length() - i - 1)) {
            ++i;
        }
        StringBuilder result = new StringBuilder();
        for (int j = 0; j < s.length() - i; j++) {
            result.append("U");
        }
        result.append(d.reverse().substring(i));
        return result.toString();
    }
}
