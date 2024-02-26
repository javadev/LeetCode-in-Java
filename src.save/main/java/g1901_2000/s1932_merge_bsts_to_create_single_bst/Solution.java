package g1901_2000.s1932_merge_bsts_to_create_single_bst;

// #Hard #Hash_Table #Depth_First_Search #Tree #Binary_Search #Binary_Tree
// #2022_05_15_Time_87_ms_(48.43%)_Space_145.9_MB_(64.15%)

import com_github_leetcode.TreeNode;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Solution {
    private static final Map<Integer, TreeNode> ROOT_VALS = new HashMap<>();

    public TreeNode canMerge(List<TreeNode> trees) {
        TreeNode root = findRoot(trees);
        if (root == null) {
            return null;
        }

        for (TreeNode t : trees) {
            ROOT_VALS.put(t.val, t);
        }

        bfs(root);

        if (!isValidBST(root) || ROOT_VALS.size() != 1) {
            return null;
        }

        return root;
    }

    private TreeNode findRoot(List<TreeNode> trees) {
        TreeNode root = null;
        Map<Integer, Integer> valCnts = new HashMap<>();
        for (TreeNode t : trees) {
            valCnts.put(t.val, valCnts.getOrDefault(t.val, 0) + 1);
            if (t.left != null) {
                valCnts.put(t.left.val, valCnts.getOrDefault(t.left.val, 0) + 1);
            }
            if (t.right != null) {
                valCnts.put(t.right.val, valCnts.getOrDefault(t.right.val, 0) + 1);
            }
        }

        for (TreeNode t : trees) {
            if (valCnts.get(t.val) == 1) {
                if (root == null) {
                    root = t;
                } else {
                    return null;
                }
            }
        }

        return root;
    }

    private void bfs(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode parent = q.poll();
                if (parent.left != null && ROOT_VALS.containsKey(parent.left.val)) {
                    TreeNode toConnect = ROOT_VALS.get(parent.left.val);
                    ROOT_VALS.remove(toConnect.val);
                    parent.left = toConnect;
                    q.offer(parent.left);
                }
                if (parent.right != null && ROOT_VALS.containsKey(parent.right.val)) {
                    TreeNode toConnect = ROOT_VALS.get(parent.right.val);
                    ROOT_VALS.remove(toConnect.val);
                    parent.right = toConnect;
                    q.offer(parent.right);
                }
            }
        }
    }

    private boolean isValidBST(TreeNode root) {
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isValidBST(TreeNode root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }

        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
    }
}
