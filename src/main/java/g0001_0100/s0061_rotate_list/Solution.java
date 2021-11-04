package g0001_0100.s0061_rotate_list;

import com_github_leetcode.ListNode;

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
