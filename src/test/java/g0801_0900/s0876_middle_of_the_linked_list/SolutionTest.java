package g0801_0900.s0876_middle_of_the_linked_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.LinkedListUtils;
import com_github_leetcode.ListNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void middleNode() {
        ListNode head = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 2, 3, 4, 5));
        assertThat(
                new Solution().middleNode(head).toString(),
                equalTo(LinkedListUtils.createSinglyLinkedList(Arrays.asList(3, 4, 5)).toString()));
    }

    @Test
    void middleNode2() {
        ListNode head = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertThat(
                new Solution().middleNode(head).toString(),
                equalTo(LinkedListUtils.createSinglyLinkedList(Arrays.asList(4, 5, 6)).toString()));
    }
}
