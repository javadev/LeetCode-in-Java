package g0801_0900.s0817_linked_list_components;

// #Medium #Hash_Table #Linked_List #2022_03_23_Time_7_ms_(76.10%)_Space_54_MB_(54.99%)

import com_github_leetcode.ListNode;
import java.util.HashSet;

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
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int result = 0;
        while (head != null) {
            if (set.contains(head.val)) {
                while (head != null && set.contains(head.val)) {
                    head = head.next;
                }
                result++;
            } else {
                head = head.next;
            }
        }
        return result;
    }
}
