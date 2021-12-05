package g0201_0300.s0203_remove_linked_list_elements_easy_linked_list_recursion;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ListNode;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void removeElements() {
        ListNode headActual = new ListNode(1);
        headActual.next = new ListNode(2);
        headActual.next.next = new ListNode(6);
        headActual.next.next.next = new ListNode(3);
        headActual.next.next.next.next = new ListNode(4);
        headActual.next.next.next.next.next = new ListNode(5);
        headActual.next.next.next.next.next.next = new ListNode(6);
        assertThat(
                new Solution().removeElements(headActual, 6).toString(), equalTo("1, 2, 3, 4, 5"));
    }
}
