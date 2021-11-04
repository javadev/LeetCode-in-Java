package g0001_0100.s0086_partition_list;

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
    public ListNode partition(ListNode head, int x) {
        ListNode nHead = new ListNode(0);
        ListNode nTail = new ListNode(0);
        ListNode ptr = nTail;
        ListNode temp = nHead;
        while (head != null) {
            ListNode nNext = head.next;
            if (head.val < x) {
                nHead.next = head;
                nHead = nHead.next;
            } else {
                nTail.next = head;
                nTail = nTail.next;
            }
            head = nNext;
        }
        nTail.next = null;
        nHead.next = ptr.next;
        return temp.next;
    }
}
