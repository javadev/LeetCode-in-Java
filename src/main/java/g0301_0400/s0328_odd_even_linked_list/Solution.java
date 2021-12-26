package g0301_0400.s0328_odd_even_linked_list;

// #Medium #Top_Interview_Questions #Linked_List

import com_github_leetcode.ListNode;

public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head != null) {
            ListNode odd = head;
            ListNode even = head.next;
            ListNode evenHead = even;
            while (even != null && even.next != null) {
                odd.next = odd.next.next;
                even.next = even.next.next;
                odd = odd.next;
                even = even.next;
            }

            odd.next = evenHead;
        }
        return head;
    }
}
