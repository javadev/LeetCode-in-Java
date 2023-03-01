package g0101_0200.s0141_linked_list_cycle;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void hasCycle() {
        ListNode listNode1 = new ListNode(3);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(0);
        listNode1.next.next.next = new ListNode(-4);
        listNode1.next.next.next.next = listNode1.next;
        assertThat(new Solution().hasCycle(listNode1), equalTo(true));
    }

    @Test
    void hasCycle2() {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = listNode1;
        assertThat(new Solution().hasCycle(listNode1), equalTo(true));
    }

    @Test
    void hasCycle3() {
        ListNode listNode1 = new ListNode(1);
        assertThat(new Solution().hasCycle(listNode1), equalTo(false));
    }
}
