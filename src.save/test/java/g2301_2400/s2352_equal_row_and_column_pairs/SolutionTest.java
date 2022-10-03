package g2301_2400.s2352_equal_row_and_column_pairs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void equalPairs() {
        assertThat(
                new Solution().equalPairs(new int[][] {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}}),
                equalTo(1));
    }

    @Test
    void equalPairs2() {
        assertThat(
                new Solution()
                        .equalPairs(
                                new int[][] {
                                    {3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}
                                }),
                equalTo(3));
    }
}
