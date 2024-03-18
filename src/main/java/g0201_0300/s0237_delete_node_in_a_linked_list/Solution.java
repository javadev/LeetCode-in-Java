package g0201_0300.s0237_delete_node_in_a_linked_list;

// #Medium #Linked_List #2022_07_04_Time_0_ms_(100.00%)_Space_43.8_MB_(62.83%)

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
