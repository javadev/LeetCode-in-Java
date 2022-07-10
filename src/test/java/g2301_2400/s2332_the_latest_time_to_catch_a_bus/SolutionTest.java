package g2301_2400.s2332_the_latest_time_to_catch_a_bus;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void latestTimeCatchTheBus() {
        assertThat(
                new Solution()
                        .latestTimeCatchTheBus(new int[] {10, 20}, new int[] {2, 17, 18, 19}, 2),
                equalTo(16));
    }

    @Test
    void latestTimeCatchTheBus2() {
        assertThat(
                new Solution()
                        .latestTimeCatchTheBus(
                                new int[] {20, 30, 10}, new int[] {19, 13, 26, 4, 25, 11, 21}, 2),
                equalTo(20));
    }

    @Test
    void latestTimeCatchTheBus3() {
        assertThat(
                new Solution().latestTimeCatchTheBus(new int[] {3}, new int[] {2, 4}, 2),
                equalTo(3));
    }
}
