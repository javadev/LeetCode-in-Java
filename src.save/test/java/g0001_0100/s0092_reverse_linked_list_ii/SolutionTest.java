package g0001_0100.s0092_reverse_linked_list_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.LinkedListUtils;
import com_github_leetcode.ListNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reverseBetween() {
        ListNode node1 = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 2, 3, 4, 5));
        assertThat(new Solution().reverseBetween(node1, 2, 4).toString(), equalTo("1, 4, 3, 2, 5"));
    }

    @Test
    void reverseBetween2() {
        ListNode node1 = LinkedListUtils.createSinglyLinkedList(Arrays.asList(5));
        assertThat(new Solution().reverseBetween(node1, 1, 1).toString(), equalTo("5"));
    }
}
