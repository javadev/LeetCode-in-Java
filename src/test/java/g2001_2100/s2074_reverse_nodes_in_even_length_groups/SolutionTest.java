package g2001_2100.s2074_reverse_nodes_in_even_length_groups;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.LinkedListUtils;
import com_github_leetcode.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reverseEvenLengthGroups() {
        ListNode head =
                LinkedListUtils.contructLinkedList(new int[] {5, 2, 6, 3, 9, 1, 7, 3, 8, 4});
        assertThat(
                new Solution().reverseEvenLengthGroups(head).toString(),
                equalTo("5, 6, 2, 3, 9, 1, 4, 8, 3, 7"));
    }

    @Test
    void reverseEvenLengthGroups2() {
        ListNode head = LinkedListUtils.contructLinkedList(new int[] {1, 1, 0, 6});
        assertThat(new Solution().reverseEvenLengthGroups(head).toString(), equalTo("1, 0, 1, 6"));
    }

    @Test
    void reverseEvenLengthGroups3() {
        ListNode head = LinkedListUtils.contructLinkedList(new int[] {1, 1, 0, 6, 5});
        assertThat(
                new Solution().reverseEvenLengthGroups(head).toString(), equalTo("1, 0, 1, 5, 6"));
    }
}
