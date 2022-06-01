package g0701_0800.s0725_split_linked_list_in_parts;

// #Medium #Linked_List #2022_03_24_Time_1_ms_(30.85%)_Space_43.9_MB_(61.88%)

import com_github_leetcode.ListNode;
import java.util.Objects;

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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = getLength(head);
        int aveSize = len / k;
        int extra = len % k;
        ListNode[] result = new ListNode[k];
        for (int i = 0; i < k; i++) {
            result[i] = head;
            int aveSizeTmp = aveSize;
            aveSizeTmp += extra-- > 0 ? 1 : 0;
            int aveSizeTmp2 = aveSizeTmp;
            while (aveSizeTmp-- > 0) {
                head = Objects.requireNonNull(head).next;
            }
            if (result[i] != null) {
                ListNode tmp = result[i];
                while (tmp.next != null && aveSizeTmp2-- > 1) {
                    tmp = tmp.next;
                }
                tmp.next = null;
            }
        }
        return result;
    }

    private int getLength(ListNode root) {
        int len = 0;
        ListNode tmp = root;
        while (tmp != null) {
            len++;
            tmp = tmp.next;
        }
        return len;
    }
}
