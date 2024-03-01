package g0001_0100.s0023_merge_k_sorted_lists;

// #Hard #Top_100_Liked_Questions #Top_Interview_Questions #Heap_Priority_Queue #Linked_List
// #Divide_and_Conquer #Merge_Sort #Big_O_Time_O(k*n*log(k))_Space_O(log(k))
// #2023_08_09_Time_1_ms_(100.00%)_Space_42.9_MB_(98.59%)

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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        return mergeKLists(lists, 0, lists.length);
    }

    private ListNode mergeKLists(ListNode[] lists, int leftIndex, int rightIndex) {
        if (rightIndex > leftIndex + 1) {
            int mid = (leftIndex + rightIndex) / 2;
            ListNode left = mergeKLists(lists, leftIndex, mid);
            ListNode right = mergeKLists(lists, mid, rightIndex);
            return mergeTwoLists(left, right);
        } else {
            return lists[leftIndex];
        }
    }

    private ListNode mergeTwoLists(ListNode left, ListNode right) {
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        ListNode res;
        if (left.val <= right.val) {
            res = left;
            left = left.next;
        } else {
            res = right;
            right = right.next;
        }
        ListNode node = res;
        while (left != null || right != null) {
            if (left == null) {
                node.next = right;
                right = right.next;
            } else if (right == null) {
                node.next = left;
                left = left.next;
            } else {
                if (left.val <= right.val) {
                    node.next = left;
                    left = left.next;
                } else {
                    node.next = right;
                    right = right.next;
                }
            }
            node = node.next;
        }
        return res;
    }
}
