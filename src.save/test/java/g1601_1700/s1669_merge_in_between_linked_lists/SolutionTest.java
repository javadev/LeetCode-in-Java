package g1601_1700.s1669_merge_in_between_linked_lists;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.LinkedListUtils;
import com_github_leetcode.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mergeInBetween() {
        ListNode list1 = LinkedListUtils.contructLinkedList(new int[] {0, 1, 2, 3, 4, 5});
        ListNode list2 = LinkedListUtils.contructLinkedList(new int[] {1000000, 1000001, 1000002});
        ListNode expected =
                LinkedListUtils.contructLinkedList(
                        new int[] {0, 1, 2, 1000000, 1000001, 1000002, 5});
        ListNode actual = new Solution().mergeInBetween(list1, 3, 4, list2);
        assertThat(actual.toString(), equalTo(expected.toString()));
    }

    @Test
    void mergeInBetween2() {
        ListNode list1 = LinkedListUtils.contructLinkedList(new int[] {0, 1, 2, 3, 4, 5, 6});
        ListNode list2 =
                LinkedListUtils.contructLinkedList(
                        new int[] {1000000, 1000001, 1000002, 1000003, 1000004});
        ListNode expected =
                LinkedListUtils.contructLinkedList(
                        new int[] {0, 1, 1000000, 1000001, 1000002, 1000003, 1000004, 6});
        ListNode actual = new Solution().mergeInBetween(list1, 2, 5, list2);
        assertThat(actual.toString(), equalTo(expected.toString()));
    }
}
