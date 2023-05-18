package g0001_0100.s0086_partition_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.LinkedListUtils;
import com_github_leetcode.ListNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void partition() {
        ListNode head = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 4, 3, 2, 5, 2));
        assertThat(new Solution().partition(head, 3).toString(), equalTo("1, 2, 2, 4, 3, 5"));
    }

    @Test
    void partition2() {
        ListNode head = LinkedListUtils.createSinglyLinkedList(Arrays.asList(2, 1));
        assertThat(new Solution().partition(head, 2).toString(), equalTo("1, 2"));
    }
}
