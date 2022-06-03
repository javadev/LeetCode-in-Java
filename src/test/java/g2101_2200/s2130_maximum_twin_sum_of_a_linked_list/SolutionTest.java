package g2101_2200.s2130_maximum_twin_sum_of_a_linked_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.LinkedListUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void pairSum() {
        assertThat(
                new Solution().pairSum(LinkedListUtils.contructLinkedList(new int[] {5, 4, 2, 1})),
                equalTo(6));
    }

    @Test
    void pairSum2() {
        assertThat(
                new Solution().pairSum(LinkedListUtils.contructLinkedList(new int[] {4, 2, 2, 3})),
                equalTo(7));
    }

    @Test
    void pairSum3() {
        assertThat(
                new Solution().pairSum(LinkedListUtils.contructLinkedList(new int[] {1, 100000})),
                equalTo(100001));
    }
}
