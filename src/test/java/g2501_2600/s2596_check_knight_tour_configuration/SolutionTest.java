package g2501_2600.s2596_check_knight_tour_configuration;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkValidGrid() {
        assertThat(
                new Solution()
                        .checkValidGrid(
                                new int[][] {
                                    {0, 11, 16, 5, 20},
                                    {17, 4, 19, 10, 15},
                                    {12, 1, 8, 21, 6},
                                    {3, 18, 23, 14, 9},
                                    {24, 13, 2, 7, 22}
                                }),
                equalTo(true));
    }

    @Test
    void checkValidGrid2() {
        assertThat(
                new Solution()
                        .checkValidGrid(
                                new int[][] {
                                    {0, 3, 6},
                                    {5, 8, 1},
                                    {2, 7, 4}
                                }),
                equalTo(false));
    }
}
