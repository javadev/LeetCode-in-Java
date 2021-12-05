package g0101_0200.s0143_reorder_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ListNode;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void reorderList() {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(3);
        listNode1.next.next.next = new ListNode(4);
        new Solution().reorderList(listNode1);
        assertThat(listNode1.toString(), equalTo("1, 4, 2, 3"));
    }
}
