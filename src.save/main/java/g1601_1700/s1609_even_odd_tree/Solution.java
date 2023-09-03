package g1601_1700.s1609_even_odd_tree;

// #Medium #Breadth_First_Search #Tree #Binary_Tree
// #2022_04_12_Time_8_ms_(98.81%)_Space_56.9_MB_(99.32%)

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    private final List<Integer> comp = new ArrayList<>();

    public boolean isEvenOddTree(TreeNode root) {
        return find(root, 0);
    }

    private boolean find(TreeNode root, int height) {
        if (root == null) {
            return true;
        }
        if ((height % 2 == 0 && root.val % 2 == 0) || (height % 2 == 1 && root.val % 2 == 1)) {
            return false;
        }
        if (comp.size() == height) {
            comp.add(root.val);
        } else {
            if (height % 2 == 0) {
                if (comp.get(height) >= root.val) {
                    return false;
                } else {
                    comp.set(height, root.val);
                }
            } else {
                if (comp.get(height) <= root.val) {
                    return false;
                } else {
                    comp.set(height, root.val);
                }
            }
        }
        return find(root.left, height + 1) && find(root.right, height + 1);
    }
}
