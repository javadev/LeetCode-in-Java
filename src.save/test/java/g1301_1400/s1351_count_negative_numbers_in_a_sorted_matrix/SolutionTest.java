package g1301_1400.s1351_count_negative_numbers_in_a_sorted_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countNegatives() {
        assertThat(
                new Solution()
                        .countNegatives(
                                new int[][] {
                                    {4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}
                                }),
                equalTo(8));
    }

    @Test
    void countNegatives2() {
        assertThat(new Solution().countNegatives(new int[][] {{3, 2}, {1, 0}}), equalTo(0));
    }
}
