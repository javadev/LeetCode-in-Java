package g1701_1800.s1721_swapping_nodes_in_a_linked_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.LinkedListUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void swapNodes() {
        assertThat(
                new Solution()
                        .swapNodes(LinkedListUtils.contructLinkedList(new int[] {1, 2, 3, 4, 5}), 2)
                        .toString(),
                equalTo(LinkedListUtils.contructLinkedList(new int[] {1, 4, 3, 2, 5}).toString()));
    }

    @Test
    void swapNodes2() {
        assertThat(
                new Solution()
                        .swapNodes(
                                LinkedListUtils.contructLinkedList(
                                        new int[] {7, 9, 6, 6, 7, 8, 3, 0, 9, 5}),
                                5)
                        .toString(),
                equalTo(
                        LinkedListUtils.contructLinkedList(new int[] {7, 9, 6, 6, 8, 7, 3, 0, 9, 5})
                                .toString()));
    }
}
