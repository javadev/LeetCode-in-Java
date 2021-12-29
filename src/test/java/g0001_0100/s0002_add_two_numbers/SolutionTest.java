package g0001_0100.s0002_add_two_numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void addTwoNumbers() {
        ListNode listNode1 = new ListNode(2);
        listNode1.next = new ListNode(4);
        listNode1.next.next = new ListNode(3);
        ListNode listNode2 = new ListNode(5);
        listNode2.next = new ListNode(6);
        listNode2.next.next = new ListNode(4);
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
        ListNode listNode1 = new ListNode(9);
        listNode1.next = new ListNode(9);
        listNode1.next.next = new ListNode(9);
        listNode1.next.next.next = new ListNode(9);
        listNode1.next.next.next.next = new ListNode(9);
        listNode1.next.next.next.next.next = new ListNode(9);
        listNode1.next.next.next.next.next.next = new ListNode(9);
        ListNode listNode2 = new ListNode(9);
        listNode2.next = new ListNode(9);
        listNode2.next.next = new ListNode(9);
        listNode2.next.next.next = new ListNode(9);
        assertThat(
                new Solution().addTwoNumbers(listNode1, listNode2).toString(),
                equalTo("8, 9, 9, 9, 0, 0, 0, 1"));
    }
}
