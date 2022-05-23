package g2001_2100.s2095_delete_the_middle_node_of_a_linked_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.LinkedListUtils;
import com_github_leetcode.ListNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void deleteMiddle() {
        ListNode node1 = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 3, 4, 7, 1, 2, 6));
        assertThat(new Solution().deleteMiddle(node1).toString(), equalTo("1, 3, 4, 1, 2, 6"));
    }

    @Test
    void deleteMiddle2() {
        ListNode node2 = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 2, 3, 4));
        assertThat(new Solution().deleteMiddle(node2).toString(), equalTo("1, 2, 4"));
    }

    @Test
    void deleteMiddle3() {
        ListNode node3 = LinkedListUtils.createSinglyLinkedList(Arrays.asList(2, 1));
        assertThat(new Solution().deleteMiddle(node3).toString(), equalTo("2"));
    }
}
