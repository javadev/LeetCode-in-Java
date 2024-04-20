package g1701_1800.s1701_average_waiting_time;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void averageWaitingTime() {
        assertThat(
                new Solution().averageWaitingTime(new int[][] {{1, 2}, {2, 5}, {4, 3}}),
                equalTo(5.000));
    }

    @Test
    void averageWaitingTime2() {
        assertThat(
                new Solution().averageWaitingTime(new int[][] {{5, 2}, {5, 4}, {10, 3}, {20, 1}}),
                equalTo(3.25));
    }
}
