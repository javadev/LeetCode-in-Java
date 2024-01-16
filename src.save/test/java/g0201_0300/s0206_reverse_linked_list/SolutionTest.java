package g0201_0300.s0206_reverse_linked_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reverseList() {
        ListNode headActual = new ListNode(1);
        headActual.next = new ListNode(2);
        headActual.next.next = new ListNode(3);
        headActual.next.next.next = new ListNode(4);
        headActual.next.next.next.next = new ListNode(5);
        assertThat(new Solution().reverseList(headActual).toString(), equalTo("5, 4, 3, 2, 1"));
    }

    @Test
    void reverseList2() {
        ListNode headActual = new ListNode(1);
        headActual.next = new ListNode(2);
        assertThat(new Solution().reverseList(headActual).toString(), equalTo("2, 1"));
    }

    @Test
    void reverseList3() {
        assertThat(new Solution().reverseList(null), equalTo(null));
    }
}
