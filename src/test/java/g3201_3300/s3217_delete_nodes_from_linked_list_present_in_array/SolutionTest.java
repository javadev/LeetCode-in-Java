package g3201_3300.s3217_delete_nodes_from_linked_list_present_in_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.LinkedListUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void modifiedList() {
        assertThat(
                new Solution()
                        .modifiedList(
                                new int[] {1, 2, 3},
                                LinkedListUtils.contructLinkedList(new int[] {1, 2, 3, 4, 5})),
                equalTo(LinkedListUtils.contructLinkedList(new int[] {4, 5})));
    }

    @Test
    void modifiedList2() {
        assertThat(
                new Solution()
                        .modifiedList(
                                new int[] {1},
                                LinkedListUtils.contructLinkedList(new int[] {1, 2, 1, 2, 1, 2})),
                equalTo(LinkedListUtils.contructLinkedList(new int[] {2, 2, 2})));
    }

    @Test
    void modifiedList3() {
        assertThat(
                new Solution()
                        .modifiedList(
                                new int[] {5},
                                LinkedListUtils.contructLinkedList(new int[] {1, 2, 3, 4})),
                equalTo(LinkedListUtils.contructLinkedList(new int[] {1, 2, 3, 4})));
    }
}
