package g0001_0100.s0019_remove_nth_node_from_end_of_list;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Two_Pointers #Linked_List
// #2022_02_17_Time_1_ms_(56.40%)_Space_42_MB_(22.71%)

import com_github_leetcode.ListNode;

public class Solution {
    int n;

    public ListNode removeNthFromEnd(ListNode head, int n) {
        this.n = n;
        ListNode node = new ListNode(0, head);
        removeNth(node);

        return node.next;
    }

    private void removeNth(ListNode node) {
        if (node.next == null) {
            return;
        }

        removeNth(node.next);
        this.n--;

        if (this.n == 0) {
            node.next = node.next.next;
        }
    }
}
