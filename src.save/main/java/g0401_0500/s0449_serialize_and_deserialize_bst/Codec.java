package g0401_0500.s0449_serialize_and_deserialize_bst;

// #Medium #String #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree #Design
// #Binary_Search_Tree #2022_06_03_Time_1_ms_(99.70%)_Space_42.9_MB_(95.36%)

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
    private final char split = (char) 0;
    private final int min = 1;
    private int cur;

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeDfs(root, sb);
        return sb.toString();
    }

    private void serializeDfs(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append(split);
            return;
        }
        sb.append((char) (root.val + min));
        serializeDfs(root.left, sb);
        serializeDfs(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        cur = 0;
        return deserializeDFS(data.toCharArray());
    }

    private TreeNode deserializeDFS(char[] data) {
        if (data[cur] == split) {
            cur++;
            return null;
        }
        TreeNode node = new TreeNode((int) data[cur++] - min);
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
