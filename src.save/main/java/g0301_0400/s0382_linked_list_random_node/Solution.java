package g0301_0400.s0382_linked_list_random_node;

// #Medium #Math #Linked_List #Randomized #Reservoir_Sampling
// #2022_03_18_Time_7_ms_(100.00%)_Space_44.1_MB_(87.88%)

import com_github_leetcode.ListNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
