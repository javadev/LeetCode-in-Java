package g0101_0200.s0142_linked_list_cycle_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void detectCycle() {
        ListNode listNode1 = new ListNode(3);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(0);
        listNode1.next.next.next = new ListNode(-4);
        listNode1.next.next.next.next = listNode1.next;
        assertThat(new Solution().detectCycle(listNode1) == listNode1.next, equalTo(true));
    }

    @Test
    void detectCycle2() {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = listNode1;
        assertThat(new Solution().detectCycle(listNode1) == listNode1, equalTo(true));
    }

    @Test
    void detectCycle3() {
        ListNode listNode1 = new ListNode(1);
        assertThat(new Solution().detectCycle(listNode1), equalTo(null));
    }
}
