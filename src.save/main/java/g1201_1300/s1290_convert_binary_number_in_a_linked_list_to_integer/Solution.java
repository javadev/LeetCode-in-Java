package g1201_1300.s1290_convert_binary_number_in_a_linked_list_to_integer;

// #Easy #Math #Linked_List #Programming_Skills_I_Day_10_Linked_List_and_Tree
// #2022_03_10_Time_0_ms_(100.00%)_Space_39.2_MB_(70.70%)

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
    public int getDecimalValue(ListNode head) {
        int l = 0;
        ListNode curr = head;
        while (curr.next != null) {
            l++;
            curr = curr.next;
        }
        curr = head;
        int num = 0;
        while (curr != null) {
            num += curr.val * (int) Math.pow(2, l--);
            curr = curr.next;
        }
        return num;
    }
}
