package g0301_0400.s0382_linked_list_random_node;

import com_github_leetcode.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<Integer> al;

    public Solution(ListNode head) {
        al = new ArrayList<>();
        while (head != null) {
            al.add(head.val);
            head = head.next;
        }
    }

    public int getRandom() {
        /*
        Math.random() will generate a random number b/w 0 & 1.
        then multiply it with the array size.
        take only the integer part which is a random index.
        return the element at that random index.
         */
        int ind = (int) (Math.random() * al.size());
        return al.get(ind);
    }
}