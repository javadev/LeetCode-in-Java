package g2001_2100.s2039_the_time_when_the_network_becomes_idle;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void networkBecomesIdle() {
        assertThat(
                new Solution()
                        .networkBecomesIdle(new int[][] {{0, 1}, {1, 2}}, new int[] {0, 2, 1}),
                equalTo(8));
    }

    @Test
    void networkBecomesIdle2() {
        assertThat(
                new Solution()
                        .networkBecomesIdle(
                                new int[][] {{0, 1}, {0, 2}, {1, 2}}, new int[] {0, 10, 10}),
                equalTo(3));
    }
}
