package g1701_1800.s1721_swapping_nodes_in_a_linked_list;

// #Medium #Two_Pointers #Linked_List #2022_04_24_Time_5_ms_(27.11%)_Space_163.5_MB_(78.20%)

import com_github_leetcode.ListNode;

public class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        int length = 0;
        int secondIndex;

        ListNode temp1 = null;
        ListNode temp2 = null;
        ListNode temp3 = head;
        while (temp3 != null) {
            length++;
            temp3 = temp3.next;
        }

        secondIndex = length - k + 1;
        temp3 = head;
        for (int i = 1; i <= length; i++) {
            if (i == k) {
                temp1 = temp3;
            }
            if (i == secondIndex) {
                temp2 = temp3;
            }
            temp3 = temp3.next;
        }
        int value = temp1.val;
        temp1.val = temp2.val;
        temp2.val = value;
        return head;
    }
}
