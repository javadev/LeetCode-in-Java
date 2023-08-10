package g0001_0100.s0061_rotate_list;

// #Medium #Two_Pointers #Linked_List #Programming_Skills_II_Day_16 #Udemy_Linked_List
// #2023_08_11_Time_0_ms_(100.00%)_Space_41.1_MB_(94.89%)

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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        ListNode tail = head;
        // find the count and let tail points to last node
        int count = 1;
        while (tail != null && tail.next != null) {
            count++;
            tail = tail.next;
        }
        // calculate number of times to rotate by count modulas
        int times = k % count;
        if (times == 0) {
            return head;
        }
        ListNode temp = head;
        // iterate and go to the K+1 th node from the end or count - K - 1 node from
        // start
        for (int i = 1; i <= count - times - 1 && temp != null; i++) {
            temp = temp.next;
        }
        ListNode newHead = null;
        if (temp != null && tail != null) {
            newHead = temp.next;
            temp.next = null;
            tail.next = head;
        }
        return newHead;
    }
}
