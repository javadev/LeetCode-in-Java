package g1501_1600.s1519_number_of_nodes_in_the_sub_tree_with_the_same_label;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countSubTrees() {
        assertThat(
                new Solution()
                        .countSubTrees(
                                7,
                                new int[][] {{0, 1}, {0, 2}, {1, 4}, {1, 5}, {2, 3}, {2, 6}},
                                "abaedcd"),
                equalTo(new int[] {2, 1, 1, 1, 1, 1, 1}));
    }

    @Test
    void countSubTrees2() {
        assertThat(
                new Solution().countSubTrees(4, new int[][] {{0, 1}, {1, 2}, {0, 3}}, "bbbb"),
                equalTo(new int[] {4, 2, 1, 1}));
    }

    @Test
    void countSubTrees3() {
        assertThat(
                new Solution()
                        .countSubTrees(5, new int[][] {{0, 1}, {0, 2}, {1, 3}, {0, 4}}, "aabab"),
                equalTo(new int[] {3, 2, 1, 1, 1}));
    }
}
