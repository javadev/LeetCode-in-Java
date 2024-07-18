package g3201_3300.s3217_delete_nodes_from_linked_list_present_in_array;

import com_github_leetcode.ListNode;

// #Medium #Array #Hash_Table #Linked_List #2024_07_18_Time_3_ms_(100.00%)_Space_63.9_MB_(93.81%)

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
public class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        int maxv = 0;
        for (int v : nums) {
            maxv = Math.max(maxv, v);
        }
        boolean[] rem = new boolean[maxv + 1];
        for (int v : nums) {
            rem[v] = true;
        }
        ListNode h = new ListNode(0);
        ListNode t = h;
        ListNode p = head;
        while (p != null) {
            if (p.val > maxv || !rem[p.val]) {
                t.next = p;
                t = p;
            }
            p = p.next;
        }
        t.next = null;
        return h.next;
    }
}
