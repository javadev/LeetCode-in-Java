package g0001_0100.s0021_merge_two_sorted_lists;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.LinkedListUtils;
import com_github_leetcode.ListNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mergeTwoLists() {
        ListNode l1 = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 2, 4));
        ListNode l2 = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 3, 4));
        assertThat(new Solution().mergeTwoLists(l1, l2).toString(), equalTo("1, 1, 2, 3, 4, 4"));
    }

    @Test
    void mergeTwoLists2() {
        assertThat(
                new Solution().mergeTwoLists(new ListNode(), new ListNode()).toString(),
                equalTo("0, 0"));
    }
}
