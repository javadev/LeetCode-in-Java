package g1201_1300.s1290_convert_binary_number_in_a_linked_list_to_integer;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getDecimalValue() {
        ListNode listNode = new ListNode(1, new ListNode(0, new ListNode(1)));
        assertThat(new Solution().getDecimalValue(listNode), equalTo(5));
    }

    @Test
    void getDecimalValue2() {
        ListNode listNode = new ListNode(0);
        assertThat(new Solution().getDecimalValue(listNode), equalTo(0));
    }
}
