package g3601_3700.s3655_xor_after_range_multiplication_queries_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void xorAfterQueries() {
        assertThat(
                new Solution().xorAfterQueries(new int[] {1, 1, 1}, new int[][] {{0, 2, 1, 4}}),
                equalTo(4));
    }

    @Test
    void xorAfterQueries2() {
        assertThat(
                new Solution()
                        .xorAfterQueries(
                                new int[] {2, 3, 1, 5, 4},
                                new int[][] {{1, 4, 2, 3}, {0, 2, 1, 2}}),
                equalTo(31));
    }
}
