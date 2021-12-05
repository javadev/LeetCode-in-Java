package g0001_0100.s0025_reverse_nodes_in_k_group;

// #Hard #Top_100_Liked_Questions #Linked_List #Recursion

import com_github_leetcode.ListNode;

public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k == 1) {
            return head;
        }
        int j = 0;
        ListNode len = head;
        // loop for checking the length of the linklist, if the linklist is less than k, then return
        // as it is.
        while (j < k) {
            if (len == null) {
                return head;
            }
            len = len.next;
            j++;
        }
        // Reverse linked list logic applied here.
        ListNode c = head;
        ListNode n = null;
        ListNode prev = null;
        int i = 0;
        // Traverse the while loop for K times to reverse the node in K groups.
        while (i != k) {
            n = c.next;
            c.next = prev;
            prev = c;
            c = n;
            i++;
        }
        // C1 is pointing to 1st node of K group, which is now going to point to the next K group
        // linklist.
        head.next = reverseKGroup(n, k); // recursion, for futher remaining linked list.
        return prev;
    }
}
