package g1301_1400.s1367_linked_list_in_binary_tree;

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree #Linked_List
// #Programming_Skills_II_Day_4 #2022_03_21_Time_2_ms_(61.23%)_Space_49.7_MB_(35.63%)

import com_github_leetcode.ListNode;
import com_github_leetcode.TreeNode;

/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) {
            return false;
        }
        return doesRootHaveList(head, root)
                || isSubPath(head, root.left)
                || isSubPath(head, root.right);
    }

    private boolean doesRootHaveList(ListNode head, TreeNode root) {
        if (head == null) {
            return true;
        }
        if (root == null) {
            return false;
        }

        return head.val == root.val
                && (doesRootHaveList(head.next, root.left)
                        || doesRootHaveList(head.next, root.right));
    }
}
