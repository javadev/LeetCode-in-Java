package g0201_0300.s0237_delete_node_in_a_linked_list;

// #Easy #Top_Interview_Questions #Linked_List #Acceptance_72.0%
// #2022_03_14_Time_0_ms_(100.00%)_Space_41.6_MB_(69.06%)

import com_github_leetcode.ListNode;

/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void deleteNode(ListNode node) {
        while (node.next.next != null) {
            node.val = node.next.val;
            node = node.next;
        }
        node.val = node.next.val;
        node.next = null;
    }
}
