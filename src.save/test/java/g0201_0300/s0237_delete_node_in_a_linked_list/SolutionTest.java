package g0201_0300.s0237_delete_node_in_a_linked_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void deleteNode() {
        ListNode headActual = new ListNode(1);
        headActual.next = new ListNode(2);
        headActual.next.next = new ListNode(3);
        headActual.next.next.next = new ListNode(4);
        new Solution().deleteNode(headActual.next.next);
        assertThat(headActual.toString(), equalTo("1, 2, 4"));
    }

    @Test
    void deleteNode2() {
        ListNode headActual = new ListNode(1);
        headActual.next = new ListNode(2);
        headActual.next.next = new ListNode(3);
        headActual.next.next.next = new ListNode(4);
        new Solution().deleteNode(headActual);
        assertThat(headActual.toString(), equalTo("2, 3, 4"));
    }

    @Test
    void deleteNode3() {
        ListNode headActual = new ListNode(1);
        headActual.next = new ListNode(2);
        headActual.next.next = new ListNode(3);
        headActual.next.next.next = new ListNode(4);
        new Solution().deleteNode(headActual.next);
        assertThat(headActual.toString(), equalTo("1, 3, 4"));
    }
}
