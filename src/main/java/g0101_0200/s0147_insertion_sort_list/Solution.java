package g0101_0200.s0147_insertion_sort_list;

// #Medium #Sorting #Linked_List #2022_06_24_Time_4_ms_(90.34%)_Space_45.1_MB_(20.93%)

import com_github_leetcode.ListNode;
import java.util.Arrays;

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
    public ListNode insertionSortList(ListNode head) {
        ListNode tnode = head;
        ListNode res = null;
        int count = 0;
        while (tnode != null) {
            count++;
            tnode = tnode.next;
        }
        int[] nums = new int[count];
        for (int i = 0; i < count; i++) {
            nums[i] = head.val;
            head = head.next;
        }
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            ListNode temp = new ListNode();
            temp.val = nums[i];
            temp.next = res;
            res = temp;
        }
        return res;
    }
}
