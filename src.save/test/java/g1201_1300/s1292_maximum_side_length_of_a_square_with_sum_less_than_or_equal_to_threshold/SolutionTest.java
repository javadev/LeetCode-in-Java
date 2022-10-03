package g1201_1300.s1292_maximum_side_length_of_a_square_with_sum_less_than_or_equal_to_threshold;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSideLength() {
        assertThat(
                new Solution()
                        .maxSideLength(
                                new int[][] {
                                    {1, 1, 3, 2, 4, 3, 2},
                                    {1, 1, 3, 2, 4, 3, 2},
                                    {1, 1, 3, 2, 4, 3, 2}
                                },
                                4),
                equalTo(2));
    }

    @Test
    void maxSideLength2() {
        assertThat(
                new Solution()
                        .maxSideLength(
                                new int[][] {
                                    {2, 2, 2, 2, 2},
                                    {2, 2, 2, 2, 2},
                                    {2, 2, 2, 2, 2},
                                    {2, 2, 2, 2, 2},
                                    {2, 2, 2, 2, 2}
                                },
                                1),
                equalTo(0));
    }
}
