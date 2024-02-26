package g0001_0100.s0083_remove_duplicates_from_sorted_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.LinkedListUtils;
import com_github_leetcode.ListNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void deleteDuplicates() {
        ListNode head = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 1, 2));
        assertThat(new Solution().deleteDuplicates(head).toString(), equalTo("1, 2"));
    }

    @Test
    void deleteDuplicates2() {
        ListNode head = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 1, 2, 3, 3));
        assertThat(new Solution().deleteDuplicates(head).toString(), equalTo("1, 2, 3"));
    }
}
