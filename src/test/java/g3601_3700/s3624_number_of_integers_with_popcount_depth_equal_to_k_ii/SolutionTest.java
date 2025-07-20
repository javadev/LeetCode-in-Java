package g3601_3700.s3624_number_of_integers_with_popcount_depth_equal_to_k_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void popcountDepth() {
        assertThat(
                new Solution()
                        .popcountDepth(
                                new long[] {2, 4},
                                new long[][] {{1, 0, 1, 1}, {2, 1, 1}, {1, 0, 1, 0}}),
                equalTo(new int[] {2, 1}));
    }

    @Test
    void popcountDepth2() {
        assertThat(
                new Solution()
                        .popcountDepth(
                                new long[] {3, 5, 6},
                                new long[][] {{1, 0, 2, 2}, {2, 1, 4}, {1, 1, 2, 1}, {1, 0, 1, 0}}),
                equalTo(new int[] {3, 1, 0}));
    }

    @Test
    void popcountDepth3() {
        assertThat(
                new Solution()
                        .popcountDepth(
                                new long[] {1, 2},
                                new long[][] {{1, 0, 1, 1}, {2, 0, 3}, {1, 0, 0, 1}, {1, 0, 0, 2}}),
                equalTo(new int[] {1, 0, 1}));
    }
}
