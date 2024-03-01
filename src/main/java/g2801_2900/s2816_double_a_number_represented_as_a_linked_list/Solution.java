package g2801_2900.s2816_double_a_number_represented_as_a_linked_list;

// #Medium #Math #Stack #Linked_List #2023_11_20_Time_4_ms_(81.41%)_Space_44.4_MB_(88.35%)

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
    public ListNode doubleIt(ListNode head) {
        ListNode temp1 = revList(head);
        ListNode list1 = null;
        ListNode current = list1;
        int carry = 0;
        while (temp1 != null) {
            int val = temp1.val * 2;
            if (list1 == null) {
                list1 = new ListNode(val % 10 + carry);
                current = list1;
            } else {
                current.next = new ListNode(val % 10 + carry);
                current = current.next;
            }
            carry = val / 10;
            temp1 = temp1.next;
        }
        if (carry == 1) {
            current.next = new ListNode(carry);
        }
        return revList(list1);
    }

    private ListNode revList(ListNode head) {
        ListNode prev = null;
        ListNode nxt = null;
        ListNode current = head;
        while (current != null) {
            nxt = current.next;
            current.next = prev;
            prev = current;
            current = nxt;
        }
        return prev;
    }
}
