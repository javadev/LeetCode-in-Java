package g2101_2200.s2196_create_binary_tree_from_descriptions;

// #Medium #Array #Hash_Table #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2022_06_06_Time_85_ms_(76.70%)_Space_120.3_MB_(19.49%)

import com_github_leetcode.TreeNode;
import java.util.HashMap;
import java.util.Map;

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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, Data> map = new HashMap<>();
        for (int[] description : descriptions) {
            Data data = map.get(description[0]);
            if (data == null) {
                data = new Data();
                data.node = new TreeNode(description[0]);
                data.isHead = true;
                map.put(description[0], data);
            }
            Data childData = map.get(description[1]);
            if (childData == null) {
                childData = new Data();
                childData.node = new TreeNode(description[1]);
                map.put(childData.node.val, childData);
            }
            childData.isHead = false;
            if (description[2] == 1) {
                data.node.left = childData.node;
            } else {
                data.node.right = childData.node;
            }
        }
        for (Map.Entry<Integer, Data> entry : map.entrySet()) {
            if (entry.getValue().isHead) {
                return entry.getValue().node;
            }
        }
        return null;
    }

    private static class Data {
        TreeNode node;
        boolean isHead;
    }
}
