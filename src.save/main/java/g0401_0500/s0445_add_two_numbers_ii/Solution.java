package g0401_0500.s0445_add_two_numbers_ii;

// #Medium #Math #Stack #Linked_List #Programming_Skills_II_Day_15 #Udemy_Linked_List
// #2022_07_16_Time_3_ms_(90.38%)_Space_48.1_MB_(35.88%)

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
    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head.next;
        while (next != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }
        curr.next = prev;
        return curr;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode res = new ListNode();
        ListNode head = res;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int val1;
            int val2;
            if (l1 == null) {
                val1 = 0;
            } else {
                val1 = l1.val;
                l1 = l1.next;
            }
            if (l2 == null) {
                val2 = 0;
            } else {
                val2 = l2.val;
                l2 = l2.next;
            }
            int data = val1 + val2 + carry;
            if (data > 9) {
                carry = data / 10;
                data = data % 10;
            } else {
                carry = 0;
            }
            res.next = new ListNode(data);
            res = res.next;
        }
        if (carry != 0) {
            res.next = new ListNode(carry);
        }
        return reverse(head.next);
    }
}
