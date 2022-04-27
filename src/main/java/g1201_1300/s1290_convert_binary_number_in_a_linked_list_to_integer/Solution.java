package g1201_1300.s1290_convert_binary_number_in_a_linked_list_to_integer;

// #Easy #Math #Linked_List #Programming_Skills_I_Day_10_Linked_List_&_Tree
// #2022_03_10_Time_0_ms_(100.00%)_Space_39.2_MB_(70.70%)

import com_github_leetcode.ListNode;

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
