package g0301_0400.s0382_linked_list_random_node;

// #Medium #Math #Linked_List #Randomized #Reservoir_Sampling
// #2022_07_13_Time_11_ms_(91.81%)_Space_44.1_MB_(94.83%)

import com_github_leetcode.ListNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
@SuppressWarnings("java:S2245")
public class Solution {
    private List<Integer> al;
    private Random rand;

    public Solution(ListNode head) {
        al = new ArrayList<>();
        rand = new Random();
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
        int ind = rand.nextInt(al.size());
        return al.get(ind);
    }
}

/*
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
