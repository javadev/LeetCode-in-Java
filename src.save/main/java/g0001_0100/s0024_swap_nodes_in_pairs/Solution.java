package g0001_0100.s0024_swap_nodes_in_pairs;

// #Medium #Top_100_Liked_Questions #Linked_List #Recursion #Data_Structure_II_Day_12_Linked_List
// #2022_06_14_Time_0_ms_(100.00%)_Space_40.3_MB_(76.55%)

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
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        int len = getLength(head);
        return reverse(head, len);
    }

    private int getLength(ListNode curr) {
        int cnt = 0;
        while (curr != null) {
            cnt++;
            curr = curr.next;
        }
        return cnt;
    }

    // Recursive function to reverse in groups
    private ListNode reverse(ListNode head, int len) {
        // base case
        if (len < 2) {
            return head;
        }

        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        for (int i = 0; i < 2; i++) {
            // reverse linked list code
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head.next = reverse(curr, len - 2);
        return prev;
    }
}
