package g0801_0900.s0817_linked_list_components;

// #Medium #Hash_Table #Linked_List

import com_github_leetcode.ListNode;
import java.util.HashSet;

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
            } else head = head.next;
        }
        return result;
    }
}
