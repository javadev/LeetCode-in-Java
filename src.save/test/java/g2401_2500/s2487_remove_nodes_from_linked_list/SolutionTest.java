package g2401_2500.s2487_remove_nodes_from_linked_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.LinkedListUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void removeNodes() {
        assertThat(
                new Solution()
                        .removeNodes(LinkedListUtils.contructLinkedList(new int[] {5, 2, 13, 3, 8}))
                        .toString(),
                equalTo(LinkedListUtils.contructLinkedList(new int[] {13, 8}).toString()));
    }

    @Test
    void removeNodes2() {
        assertThat(
                new Solution()
                        .removeNodes(LinkedListUtils.contructLinkedList(new int[] {1, 1, 1, 1}))
                        .toString(),
                equalTo(LinkedListUtils.contructLinkedList(new int[] {1, 1, 1, 1}).toString()));
    }
}
