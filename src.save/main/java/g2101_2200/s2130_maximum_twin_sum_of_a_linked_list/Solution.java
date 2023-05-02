package g2101_2200.s2130_maximum_twin_sum_of_a_linked_list;

// #Medium #Two_Pointers #Stack #Linked_List #2022_06_03_Time_9_ms_(57.92%)_Space_118.7_MB_(38.33%)

import com_github_leetcode.ListNode;

public class Solution {
    public int pairSum(ListNode head) {
        if (head == null) {
            return 0;
        }
        int maxSum = Integer.MIN_VALUE;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (slow.next == null) {
            return head.val + slow.val;
        }
        ListNode tail = head;
        ListNode pivot = reverse(slow);
        while (pivot != null) {
            maxSum = Math.max(maxSum, (tail.val + pivot.val));
            tail = tail.next;
            pivot = pivot.next;
        }
        return maxSum;
    }

    private ListNode reverse(ListNode head) {
        ListNode tail = head;
        ListNode prev = null;
        while (tail != null) {
            ListNode temp = tail.next;
            tail.next = prev;
            prev = tail;
            tail = temp;
        }
        return prev;
    }
}
