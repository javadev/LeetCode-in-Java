package g0001_0100.s0021_merge_two_sorted_lists;

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Linked_List #Recursion
// #2022_02_17_Time_1_ms_(61.88%)_Space_42.8_MB_(22.76%)

import com_github_leetcode.ListNode;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode list = new ListNode(-1);
        ListNode head = list;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    list.next = new ListNode(l1.val);
                    l1 = l1.next;
                } else {
                    list.next = new ListNode(l2.val);
                    l2 = l2.next;
                }
            } else if (l1 != null) {
                list.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                list.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            list = list.next;
        }
        return head.next;
    }
}
