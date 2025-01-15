package g3401_3500.s3417_zigzag_grid_traversal_with_skip;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void zigzagTraversal() {
        assertThat(
                new Solution().zigzagTraversal(new int[][] {{1, 2}, {3, 4}}),
                equalTo(List.of(1, 4)));
    }

    @Test
    void zigzagTraversal2() {
        assertThat(
                new Solution().zigzagTraversal(new int[][] {{2, 1}, {2, 1}, {2, 1}}),
                equalTo(List.of(2, 1, 2)));
    }

    @Test
    void zigzagTraversal3() {
        assertThat(
                new Solution().zigzagTraversal(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}),
                equalTo(List.of(1, 3, 5, 7, 9)));
    }
}
