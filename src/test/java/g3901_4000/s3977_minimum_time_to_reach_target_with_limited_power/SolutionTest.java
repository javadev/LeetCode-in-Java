package g3901_4000.s3977_minimum_time_to_reach_target_with_limited_power;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minTimeMaxPower() {
        assertThat(
                new Solution()
                        .minTimeMaxPower(
                                5,
                                new int[][] {{0, 1, 1}, {1, 4, 1}, {0, 2, 1}, {2, 3, 1}, {3, 4, 1}},
                                4,
                                new int[] {2, 3, 1, 1, 1},
                                0,
                                4),
                equalTo(new long[] {3, 0}));
    }

    @Test
    void minTimeMaxPower2() {
        assertThat(
                new Solution()
                        .minTimeMaxPower(
                                3,
                                new int[][] {{0, 1, 2}, {1, 2, 2}, {2, 0, 2}},
                                3,
                                new int[] {1, 1, 1},
                                1,
                                1),
                equalTo(new long[] {0, 3}));
    }

    @Test
    void minTimeMaxPower3() {
        assertThat(
                new Solution()
                        .minTimeMaxPower(
                                4,
                                new int[][] {{0, 1, 3}, {2, 3, 4}},
                                3,
                                new int[] {1, 1, 1, 1},
                                0,
                                3),
                equalTo(new long[] {-1, -1}));
    }
}
