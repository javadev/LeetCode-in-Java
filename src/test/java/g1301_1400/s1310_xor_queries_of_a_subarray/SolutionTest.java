package g1301_1400.s1310_xor_queries_of_a_subarray;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void xorQueries() {
        assertThat(
                new Solution()
                        .xorQueries(
                                new int[] {1, 3, 4, 8},
                                new int[][] {{0, 1}, {1, 2}, {0, 3}, {3, 3}}),
                equalTo(new int[] {2, 7, 14, 8}));
    }

    @Test
    void xorQueries2() {
        assertThat(
                new Solution()
                        .xorQueries(
                                new int[] {4, 8, 2, 10},
                                new int[][] {{2, 3}, {1, 3}, {0, 0}, {0, 3}}),
                equalTo(new int[] {8, 0, 4, 4}));
    }
}
