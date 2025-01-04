package g3301_3400.s3394_check_if_grid_can_be_cut_into_sections;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkValidCuts() {
        assertThat(
                new Solution()
                        .checkValidCuts(
                                5,
                                new int[][] {
                                    {1, 0, 5, 2}, {0, 2, 2, 4}, {3, 2, 5, 3}, {0, 4, 4, 5}
                                }),
                equalTo(true));
    }

    @Test
    void checkValidCuts2() {
        assertThat(
                new Solution()
                        .checkValidCuts(
                                4,
                                new int[][] {
                                    {0, 0, 1, 1}, {2, 0, 3, 4}, {0, 2, 2, 3}, {3, 0, 4, 3}
                                }),
                equalTo(true));
    }

    @Test
    void checkValidCuts3() {
        assertThat(
                new Solution()
                        .checkValidCuts(
                                4,
                                new int[][] {
                                    {0, 2, 2, 4},
                                    {1, 0, 3, 2},
                                    {2, 2, 3, 4},
                                    {3, 0, 4, 2},
                                    {3, 2, 4, 4}
                                }),
                equalTo(false));
    }
}
