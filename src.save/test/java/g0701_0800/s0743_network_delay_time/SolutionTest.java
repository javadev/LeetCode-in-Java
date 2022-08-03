package g0701_0800.s0743_network_delay_time;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void networkDelayTime() {
        assertThat(
                new Solution()
                        .networkDelayTime(new int[][] {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}}, 4, 2),
                equalTo(2));
    }

    @Test
    void networkDelayTime2() {
        assertThat(new Solution().networkDelayTime(new int[][] {{1, 2, 1}}, 2, 1), equalTo(1));
    }

    @Test
    void networkDelayTime3() {
        assertThat(new Solution().networkDelayTime(new int[][] {{1, 2, 1}}, 2, 2), equalTo(-1));
    }
}
