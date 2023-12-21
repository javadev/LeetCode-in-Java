package g2201_2300.s2245_maximum_trailing_zeros_in_a_cornered_path;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxTrailingZeros() {
        assertThat(
                new Solution()
                        .maxTrailingZeros(
                                new int[][] {
                                    {23, 17, 15, 3, 20},
                                    {8, 1, 20, 27, 11},
                                    {9, 4, 6, 2, 21},
                                    {40, 9, 1, 10, 6},
                                    {22, 7, 4, 5, 3}
                                }),
                equalTo(3));
    }

    @Test
    void maxTrailingZeros2() {
        assertThat(
                new Solution().maxTrailingZeros(new int[][] {{4, 3, 2}, {7, 6, 1}, {8, 8, 8}}),
                equalTo(0));
    }
}
