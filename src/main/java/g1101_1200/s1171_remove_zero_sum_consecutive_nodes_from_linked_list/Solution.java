package g1101_1200.s1171_remove_zero_sum_consecutive_nodes_from_linked_list;

// #Medium #Hash_Table #Linked_List #2022_03_05_Time_2_ms_(90.39%)_Space_42_MB_(50.20%)

import com_github_leetcode.ListNode;
import java.util.HashMap;
import java.util.Map;

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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode pre = new ListNode(-1);
        ListNode curr = pre;
        pre.next = head;
        Map<Integer, ListNode> map = new HashMap<>();
        int preSum = 0;
        while (curr != null) {
            preSum += curr.val;
            if (map.containsKey(preSum)) {
                curr = map.get(preSum).next;
                int key = preSum + curr.val;
                while (key != preSum) {
                    map.remove(key);
                    curr = curr.next;
                    key += curr.val;
                }
                map.get(preSum).next = curr.next;
            } else {
                map.put(preSum, curr);
            }
            curr = curr.next;
        }
        return pre.next;
    }
}
