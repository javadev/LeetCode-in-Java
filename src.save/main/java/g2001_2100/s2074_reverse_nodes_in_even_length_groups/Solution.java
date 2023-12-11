package g2001_2100.s2074_reverse_nodes_in_even_length_groups;

// #Medium #Linked_List #2022_05_29_Time_9_ms_(62.36%)_Space_270.4_MB_(37.64%)

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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        int totalSize = size(head);
        int curSize = 1;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy;
        while (totalSize > 0) {
            if (curSize % 2 == 0) {
                ListNode[] arr = reverse(cur.next, curSize);
                cur.next = arr[0];
                arr[1].next = arr[2];
                cur = arr[1];
            } else {
                for (int i = 0; i < curSize; i++) {
                    cur = cur.next;
                }
            }
            totalSize -= curSize;
            curSize = totalSize >= curSize + 1 ? curSize + 1 : totalSize;
        }
        return head;
    }

    private ListNode[] reverse(ListNode head, int size) {
        ListNode prev = null;
        ListNode forward;
        ListNode cur = head;
        while (size-- > 0) {
            forward = cur.next;
            cur.next = prev;
            prev = cur;
            cur = forward;
        }
        ListNode[] arr = new ListNode[3];
        arr[0] = prev;
        arr[1] = head;
        arr[2] = cur;
        return arr;
    }

    private int size(ListNode head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }
}
