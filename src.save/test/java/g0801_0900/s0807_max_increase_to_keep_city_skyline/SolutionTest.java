package g0801_0900.s0807_max_increase_to_keep_city_skyline;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxIncreaseKeepingSkyline() {
        assertThat(
                new Solution()
                        .maxIncreaseKeepingSkyline(
                                new int[][] {
                                    {3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}
                                }),
                equalTo(35));
    }

    @Test
    void maxIncreaseKeepingSkyline2() {
        assertThat(
                new Solution()
                        .maxIncreaseKeepingSkyline(new int[][] {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}),
                equalTo(0));
    }
}
