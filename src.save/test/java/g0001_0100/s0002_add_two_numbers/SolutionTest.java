package g0001_0100.s0002_add_two_numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.LinkedListUtils;
import com_github_leetcode.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void addTwoNumbers() {
        ListNode listNode1 = LinkedListUtils.contructLinkedList(new int[] {2, 4, 3});
        ListNode listNode2 = LinkedListUtils.contructLinkedList(new int[] {5, 6, 4});
        assertThat(
                new Solution().addTwoNumbers(listNode1, listNode2).toString(), equalTo("7, 0, 8"));
    }

    @Test
    void addTwoNumbers2() {
        assertThat(
                new Solution().addTwoNumbers(new ListNode(0), new ListNode(0)).toString(),
                equalTo("0"));
    }

    @Test
    void addTwoNumbers3() {
        ListNode listNode1 = LinkedListUtils.contructLinkedList(new int[] {9, 9, 9, 9, 9, 9, 9});
        ListNode listNode2 = LinkedListUtils.contructLinkedList(new int[] {9, 9, 9, 9});
        assertThat(
                new Solution().addTwoNumbers(listNode1, listNode2).toString(),
                equalTo("8, 9, 9, 9, 0, 0, 0, 1"));
    }
}
