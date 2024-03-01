package g2301_2400.s2373_largest_local_values_in_a_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestLocal() {
        assertThat(
                new Solution()
                        .largestLocal(
                                new int[][] {
                                    {9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}
                                }),
                equalTo(new int[][] {{9, 9}, {8, 6}}));
    }

    @Test
    void largestLocal2() {
        assertThat(
                new Solution()
                        .largestLocal(
                                new int[][] {
                                    {1, 1, 1, 1, 1},
                                    {1, 1, 1, 1, 1},
                                    {1, 1, 2, 1, 1},
                                    {1, 1, 1, 1, 1},
                                    {1, 1, 1, 1, 1}
                                }),
                equalTo(new int[][] {{2, 2, 2}, {2, 2, 2}, {2, 2, 2}}));
    }
}
