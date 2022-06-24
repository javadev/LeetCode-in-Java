package g0101_0200.s0143_reorder_list;

// #Medium #Two_Pointers #Stack #Linked_List #Recursion #Data_Structure_II_Day_13_Linked_List
// #Programming_Skills_II_Day_14 #2022_06_24_Time_2_ms_(72.59%)_Space_55.1_MB_(5.83%)

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
