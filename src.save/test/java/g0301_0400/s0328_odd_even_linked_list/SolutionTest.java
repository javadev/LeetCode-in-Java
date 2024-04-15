package g0301_0400.s0328_odd_even_linked_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void oddEvenList() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(3);
        expected.next.next = new ListNode(5);
        expected.next.next.next = new ListNode(2);
        expected.next.next.next.next = new ListNode(4);
        assertThat(new Solution().oddEvenList(node).toString(), equalTo(expected.toString()));
    }

    @Test
    void oddEvenList2() {
        ListNode node = new ListNode(2);
        node.next = new ListNode(1);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(5);
        node.next.next.next.next = new ListNode(6);
        node.next.next.next.next.next = new ListNode(4);
        node.next.next.next.next.next.next = new ListNode(7);
        ListNode expected = new ListNode(2);
        expected.next = new ListNode(3);
        expected.next.next = new ListNode(6);
        expected.next.next.next = new ListNode(7);
        expected.next.next.next.next = new ListNode(1);
        expected.next.next.next.next.next = new ListNode(5);
        expected.next.next.next.next.next.next = new ListNode(4);
        assertThat(new Solution().oddEvenList(node).toString(), equalTo(expected.toString()));
    }
}
