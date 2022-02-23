package g0101_0200.s0160_intersection_of_two_linked_lists;

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Hash_Table #Two_Pointers #Linked_List
// #Data_Structure_II_Day_11_Linked_List #2022_02_23_Time_2_ms_(61.05%)_Space_55.1_MB_(26.21%)

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
