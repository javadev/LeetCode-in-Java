package g3501_3600.s3593_minimum_increments_to_equalize_leaf_paths;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minIncrease() {
        assertThat(
                new Solution().minIncrease(3, new int[][] {{0, 1}, {0, 2}}, new int[] {2, 1, 3}),
                equalTo(1));
    }

    @Test
    void minIncrease2() {
        assertThat(
                new Solution().minIncrease(3, new int[][] {{0, 1}, {1, 2}}, new int[] {5, 1, 4}),
                equalTo(0));
    }

    @Test
    void minIncrease3() {
        assertThat(
                new Solution()
                        .minIncrease(
                                5,
                                new int[][] {{0, 4}, {0, 1}, {1, 2}, {1, 3}},
                                new int[] {3, 4, 1, 1, 7}),
                equalTo(1));
    }
}
