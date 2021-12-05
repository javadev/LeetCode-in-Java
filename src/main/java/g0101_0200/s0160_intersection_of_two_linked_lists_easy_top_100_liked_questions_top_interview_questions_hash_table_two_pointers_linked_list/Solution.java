package g0101_0200.s0160_intersection_of_two_linked_lists_easy_top_100_liked_questions_top_interview_questions_hash_table_two_pointers_linked_list;

import com_github_leetcode.ListNode;

@SuppressWarnings("java:S2583")
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode node1 = headA;
        ListNode node2 = headB;
        while (node1 != node2) {
            node1 = node1 == null ? headB : node1.next;
            node2 = node2 == null ? headA : node2.next;
        }
        return node1;
    }
}
