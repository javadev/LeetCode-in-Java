package g0101_0200.s0143_reorder_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.LinkedListUtils;
import com_github_leetcode.ListNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reorderList() {
        ListNode head = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 2, 3, 4));
        ListNode expected = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 4, 2, 3));
        new Solution().reorderList(head);
        assertThat(head.toString(), equalTo(expected.toString()));
    }

    @Test
    void reorderList2() {
        ListNode head = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 2, 3, 4, 5));
        ListNode expected = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 5, 2, 4, 3));
        new Solution().reorderList(head);
        assertThat(head.toString(), equalTo(expected.toString()));
    }
}
