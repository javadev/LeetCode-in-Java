package g3601_3700.s3608_minimum_time_for_k_connected_components;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minTime() {
        assertThat(new Solution().minTime(2, new int[][] {{0, 1, 3}}, 2), equalTo(3));
    }

    @Test
    void minTime2() {
        assertThat(new Solution().minTime(3, new int[][] {{0, 1, 2}, {1, 2, 4}}, 3), equalTo(4));
    }

    @Test
    void minTime3() {
        assertThat(new Solution().minTime(3, new int[][] {{0, 2, 5}}, 2), equalTo(0));
    }
}
