package g0701_0800.s0725_split_linked_list_in_parts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.LinkedListUtils;
import com_github_leetcode.ListNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void splitListToParts() {
        ListNode listNode = LinkedListUtils.contructLinkedList(new int[] {1, 2, 3});
        ListNode[] expected =
                new ListNode[] {
                    LinkedListUtils.contructLinkedList(new int[] {1}),
                    LinkedListUtils.contructLinkedList(new int[] {2}),
                    LinkedListUtils.contructLinkedList(new int[] {3}),
                    LinkedListUtils.contructLinkedList(new int[] {}),
                    LinkedListUtils.contructLinkedList(new int[] {})
                };
        assertThat(
                Arrays.toString(new Solution().splitListToParts(listNode, 5)),
                equalTo(Arrays.toString(expected)));
    }

    @Test
    void splitListToParts2() {
        ListNode listNode =
                LinkedListUtils.contructLinkedList(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        ListNode[] expected =
                new ListNode[] {
                    LinkedListUtils.contructLinkedList(new int[] {1, 2, 3, 4}),
                    LinkedListUtils.contructLinkedList(new int[] {5, 6, 7}),
                    LinkedListUtils.contructLinkedList(new int[] {8, 9, 10})
                };
        assertThat(
                Arrays.toString(new Solution().splitListToParts(listNode, 3)),
                equalTo(Arrays.toString(expected)));
    }
}
