package g0101_0200.s0160_intersection_of_two_linked_lists;

import com_github_leetcode.ListNode;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != null || pB != null) {
            if (pA != null && pB != null && pA.toString().equals(pB.toString())) {
                return pA;
            }
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return null;
    }
}
