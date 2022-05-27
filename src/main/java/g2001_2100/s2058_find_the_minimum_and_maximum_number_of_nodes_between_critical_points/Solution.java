package g2001_2100.s2058_find_the_minimum_and_maximum_number_of_nodes_between_critical_points;

// #Medium #Linked_List #2022_05_27_Time_4_ms_(100.00%)_Space_63.7_MB_(88.92%)

import com_github_leetcode.ListNode;

public class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode p = head;
        ListNode c = p.next;
        ListNode n = c.next;
        int current = 1;
        int first = -1;
        int last = -1;
        int min = -1;
        while (n != null) {
            if ((c.val > p.val && c.val > n.val) || (c.val < p.val && c.val < n.val)) {
                if (first == -1) {
                    first = current;
                } else if (min == -1) {
                    min = current - last;
                } else {
                    min = Math.min(min, current - last);
                }
                last = current;
            }
            p = c;
            c = n;
            n = n.next;
            current++;
        }
        return new int[] {min, (last == first ? -1 : last - first)};
    }
}
