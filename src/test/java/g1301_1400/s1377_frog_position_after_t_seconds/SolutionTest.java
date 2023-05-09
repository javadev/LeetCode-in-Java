package g1301_1400.s1377_frog_position_after_t_seconds;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void frogPosition() {
        assertThat(
                new Solution()
                        .frogPosition(
                                7,
                                new int[][] {{1, 2}, {1, 3}, {1, 7}, {2, 4}, {2, 6}, {3, 5}},
                                2,
                                4),
                equalTo(0.16666666666666666));
    }

    @Test
    void frogPosition2() {
        assertThat(
                new Solution()
                        .frogPosition(
                                7,
                                new int[][] {{1, 2}, {1, 3}, {1, 7}, {2, 4}, {2, 6}, {3, 5}},
                                1,
                                7),
                equalTo(0.3333333333333333));
    }
}
