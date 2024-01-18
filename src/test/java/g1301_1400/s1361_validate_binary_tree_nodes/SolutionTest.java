package g1301_1400.s1361_validate_binary_tree_nodes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void validateBinaryTreeNodes() {
        assertThat(
                new Solution()
                        .validateBinaryTreeNodes(
                                4, new int[] {1, -1, 3, -1}, new int[] {2, -1, -1, -1}),
                equalTo(true));
    }

    @Test
    void validateBinaryTreeNodes2() {
        assertThat(
                new Solution()
                        .validateBinaryTreeNodes(
                                4, new int[] {1, -1, 3, -1}, new int[] {2, 3, -1, -1}),
                equalTo(false));
    }

    @Test
    void validateBinaryTreeNodes3() {
        assertThat(
                new Solution().validateBinaryTreeNodes(2, new int[] {1, 0}, new int[] {-1, -1}),
                equalTo(false));
    }
}
