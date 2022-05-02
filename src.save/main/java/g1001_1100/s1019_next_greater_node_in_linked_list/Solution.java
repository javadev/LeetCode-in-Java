package g1001_1100.s1019_next_greater_node_in_linked_list;

// #Medium #Array #Stack #Linked_List #Monotonic_Stack
// #2022_02_25_Time_11_ms_(96.35%)_Space_68.4_MB_(69.90%)

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
    public int[] nextLargerNodes(ListNode head) {
        int len = length(head);
        int i = 0;
        int[] arr = new int[len];
        int[] idx = new int[len];
        while (head != null) {
            arr[i] = head.val;
            head = head.next;
            i++;
        }
        hlp(arr, idx, 0);
        i = 0;
        while (i < idx.length) {
            int j = idx[i];
            if (j != -1) {
                arr[i] = arr[j];
            } else {
                arr[i] = 0;
            }
            i++;
        }
        arr[i - 1] = 0;
        return arr;
    }

    private void hlp(int[] arr, int[] idx, int i) {
        if (i == arr.length - 1) {
            idx[i] = -1;
            return;
        }
        hlp(arr, idx, i + 1);
        int j = i + 1;
        while (j != -1 && arr[i] >= arr[j]) {
            j = idx[j];
        }
        if ((j != -1) && arr[i] >= arr[j]) {
            idx[i] = -1;
        } else {
            idx[i] = j;
        }
    }

    private int length(ListNode head) {
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }
        return len;
    }
}
