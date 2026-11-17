package g4001_4100.s4009_minimum_possible_maximum_waiting_time;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minMaxWaitingTime() {
        assertThat(
                new Solution().minMaxWaitingTime(new int[] {6, 8, 4, 6, 5}, new int[] {16, 13}),
                equalTo(6));
    }

    @Test
    void minMaxWaitingTime2() {
        assertThat(
                new Solution().minMaxWaitingTime(new int[] {10, 15}, new int[] {12, 17}),
                equalTo(0));
    }

    @Test
    void minMaxWaitingTime3() {
        assertThat(
                new Solution().minMaxWaitingTime(new int[] {10, 5}, new int[] {8, 8}), equalTo(-1));
    }
}
