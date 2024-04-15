package g0201_0300.s0297_serialize_and_deserialize_binary_tree;

// #Hard #String #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree #Design
// #Data_Structure_II_Day_18_Tree #Udemy_Tree_Stack_Queue
// #2022_07_06_Time_7_ms_(98.13%)_Space_51.1_MB_(74.13%)

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
    private static final int BASE_OFFSET = 1000;
    private static final String DELIM = "*";
    private int offset;

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        offset = 0;
        serialize(root, sb);
        return sb.toString();
    }

    public void serialize(TreeNode root, StringBuilder sb) {
        // all nodes fit into 4 bits.
        // IFF we offset at 0. So encode(val) = val + min(default - 1000)
        if (root == null) {
            sb.append(DELIM);
            return;
        }
        String s = Integer.toHexString(root.val + BASE_OFFSET);
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < 3 - s.length(); i++) {
            sb2.append('0');
        }
        sb2.append(s);
        sb.append(sb2);
        serialize(root.left, sb);
        serialize(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.charAt(offset) == '*') {
            offset++;
            return null;
        }
        TreeNode root =
                new TreeNode(
                        Integer.parseInt(data.substring(offset, offset + 3), 16) - BASE_OFFSET);
        offset += 3;
        root.left = deserialize(data);
        root.right = deserialize(data);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
