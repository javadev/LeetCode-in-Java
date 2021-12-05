package g0001_0100.s0061_rotate_list_medium_two_pointers_linked_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ListNode;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void rotateRight() {
        ListNode headActual = new ListNode(1);
        headActual.next = new ListNode(2);
        headActual.next.next = new ListNode(3);
        headActual.next.next.next = new ListNode(4);
        headActual.next.next.next.next = new ListNode(5);
        assertThat(new Solution().rotateRight(headActual, 2).toString(), equalTo("4, 5, 1, 2, 3"));
    }
}
