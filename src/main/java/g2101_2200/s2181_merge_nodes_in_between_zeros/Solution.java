package g2101_2200.s2181_merge_nodes_in_between_zeros;

// #Medium #Simulation #Linked_List #2022_06_02_Time_6_ms_(96.26%)_Space_71.2_MB_(97.95%)

import com_github_leetcode.ListNode;

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
public class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head.next;
        ListNode slow = head;
        int sum = 0;
        ListNode fast = temp;
        while (temp != null) {
            if (temp.val == 0) {
                temp.val = sum;
                sum = 0;
                slow.next = fast.next;
                slow = temp;
                fast = fast.next;
            } else {
                sum += temp.val;
                fast = temp;
            }
            temp = temp.next;
        }
        return head.next;
    }
}
