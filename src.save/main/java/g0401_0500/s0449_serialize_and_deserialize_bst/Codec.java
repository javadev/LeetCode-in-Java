package g0401_0500.s0449_serialize_and_deserialize_bst;

// #Medium #String #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree #Design
// #Binary_Search_Tree #2022_07_18_Time_1_ms_(99.59%)_Space_42.6_MB_(99.27%)

import com_github_leetcode.TreeNode;

/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    private static final char SPLIT = (char) 0;
    private static final int MIN = 1;
    private int cur;

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeDfs(root, sb);
        return sb.toString();
    }

    private void serializeDfs(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append(SPLIT);
            return;
        }
        sb.append((char) (root.val + MIN));
        serializeDfs(root.left, sb);
        serializeDfs(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        cur = 0;
        return deserializeDFS(data.toCharArray());
    }

    private TreeNode deserializeDFS(char[] data) {
        if (data[cur] == SPLIT) {
            cur++;
            return null;
        }
        TreeNode node = new TreeNode(data[cur++] - MIN);
        node.left = deserializeDFS(data);
        node.right = deserializeDFS(data);
        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;
