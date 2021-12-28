package g0101_0200.s0109_convert_sorted_list_to_binary_search_tree;

// #Medium #Tree #Binary_Tree #Linked_List #Binary_Search_Tree #Divide_and_Conquer

import com_github_leetcode.ListNode;
import com_github_leetcode.TreeNode;

public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        // Empty list -> empty tree / sub-tree
        if (head == null) {
            return null;
        }
        // No next node -> this node will become leaf
        if (head.next == null) {
            TreeNode leaf = new TreeNode(head.val);
            leaf.left = null;
            leaf.right = null;
            return leaf;
        }
        ListNode slow = head;
        // Head-Start fast by 1 to get slow = mid -1
        ListNode fast = head.next.next;
        // Find the mid of list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // slow.next ->  mid = our "root"
        TreeNode root = new TreeNode(slow.next.val);
        // Right sub tree from mid - end
        root.right = sortedListToBST(slow.next.next);
        // Left sub tree from head - mid (chop slow.next)
        slow.next = null;
        root.left = sortedListToBST(head);
        return root;
    }
}
