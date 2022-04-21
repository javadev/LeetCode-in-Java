package g1601_1700.s1669_merge_in_between_linked_lists;

// #Medium #Linked_List #2022_04_22_Time_2_ms_(76.51%)_Space_104.4_MB_(49.36%)

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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode start = list1;
        for (int i = 1; i < a; i++) {
            start = start.next;
        }
        ListNode end = start;
        for (int i = a; i <= b; i++) {
            end = end.next;
        }
        start.next = list2;
        while (list2.next != null) {
            list2 = list2.next;
        }
        list2.next = end.next;
        return list1;
    }
}
