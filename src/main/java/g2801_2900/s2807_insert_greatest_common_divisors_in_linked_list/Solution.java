package g2801_2900.s2807_insert_greatest_common_divisors_in_linked_list;

// #Medium #Array #Math #Linked_List #2023_09_25_Time_1_ms_(100.00%)_Space_43.4_MB_(93.05%)

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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode prevNode = null;
        ListNode currNode = head;
        while (currNode != null) {
            if (prevNode != null) {
                int gcd = greatestCommonDivisor(prevNode.val, currNode.val);
                prevNode.next = new ListNode(gcd, currNode);
            }
            prevNode = currNode;
            currNode = currNode.next;
        }
        return head;
    }

    private int greatestCommonDivisor(int val1, int val2) {
        if (val2 == 0) {
            return val1;
        }
        return greatestCommonDivisor(val2, val1 % val2);
    }
}
