package g0101_0200.s0148_sort_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sortList() {
        ListNode listNode1 = new ListNode(4);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(1);
        listNode1.next.next.next = new ListNode(3);
        assertThat(new Solution().sortList(listNode1).toString(), equalTo("1, 2, 3, 4"));
    }

    @Test
    void sortList2() {
        ListNode listNode1 = new ListNode(-1);
        listNode1.next = new ListNode(5);
        listNode1.next.next = new ListNode(3);
        listNode1.next.next.next = new ListNode(4);
        listNode1.next.next.next.next = new ListNode(0);
        assertThat(new Solution().sortList(listNode1).toString(), equalTo("-1, 0, 3, 4, 5"));
    }

    @Test
    void sortList3() {
        assertThat(new Solution().sortList(null), equalTo(null));
    }
}
