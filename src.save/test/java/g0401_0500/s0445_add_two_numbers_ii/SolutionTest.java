package g0401_0500.s0445_add_two_numbers_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.LinkedListUtils;
import com_github_leetcode.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void addTwoNumbers() {
        ListNode l1 = LinkedListUtils.contructLinkedList(new int[] {7, 2, 4, 3});
        ListNode l2 = LinkedListUtils.contructLinkedList(new int[] {5, 6, 4});
        assertThat(new Solution().addTwoNumbers(l1, l2).toString(), equalTo("7, 8, 0, 7"));
    }

    @Test
    void addTwoNumbers2() {
        ListNode l1 = LinkedListUtils.contructLinkedList(new int[] {2, 4, 3});
        ListNode l2 = LinkedListUtils.contructLinkedList(new int[] {5, 6, 4});
        assertThat(new Solution().addTwoNumbers(l1, l2).toString(), equalTo("8, 0, 7"));
    }

    @Test
    void addTwoNumbers3() {
        ListNode l1 = LinkedListUtils.contructLinkedList(new int[] {0});
        ListNode l2 = LinkedListUtils.contructLinkedList(new int[] {0});
        assertThat(new Solution().addTwoNumbers(l1, l2).toString(), equalTo("0"));
    }
}
