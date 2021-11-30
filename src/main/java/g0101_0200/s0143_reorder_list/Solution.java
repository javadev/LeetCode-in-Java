package g0101_0200.s0143_reorder_list;

import com_github_leetcode.ListNode;

/*
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    private ListNode forward;

    public void reorderList(ListNode head) {
        forward = head;
        dfs(head);
    }

    private void dfs(ListNode node) {
        if (node != null) {
            dfs(node.next);
            if (forward != null) {
                ListNode next = forward.next;
                // even case: forward.next coincide with node
                if (next == node) {
                    node.next = null;
                } else {
                    node.next = next;
                }
                forward.next = node;
                forward = node.next;
            }
            // odd case: forward coincide with node
            if (forward == node) {
                forward.next = null;
                forward = forward.next;
            }
        }
    }
}
