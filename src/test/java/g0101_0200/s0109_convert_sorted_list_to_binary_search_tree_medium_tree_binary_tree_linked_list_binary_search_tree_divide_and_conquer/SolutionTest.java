package g0101_0200.s0109_convert_sorted_list_to_binary_search_tree_medium_tree_binary_tree_linked_list_binary_search_tree_divide_and_conquer;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ListNode;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void convertSortedListToBST() {
        ListNode nodes =
                new ListNode(
                        -10, new ListNode(-3, new ListNode(0, new ListNode(5, new ListNode(9)))));
        assertThat(
                new Solution().sortedListToBST(nodes).toString(),
                equalTo("0,-3,-10,null,9,5,null"));
    }
}
