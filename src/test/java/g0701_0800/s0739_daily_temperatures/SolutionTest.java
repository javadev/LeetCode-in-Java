package g0701_0800.s0739_daily_temperatures;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void dailyTemperatures() {
        assertThat(
                new Solution().dailyTemperatures(new int[] {73, 74, 75, 71, 69, 72, 76, 73}),
                equalTo(new int[] {1, 1, 4, 2, 1, 1, 0, 0}));
    }

    @Test
    void dailyTemperatures2() {
        assertThat(
                new Solution().dailyTemperatures(new int[] {30, 40, 50, 60}),
                equalTo(new int[] {1, 1, 1, 0}));
    }

    @Test
    void dailyTemperatures3() {
        assertThat(
                new Solution().dailyTemperatures(new int[] {30, 60, 90}),
                equalTo(new int[] {1, 1, 0}));
    }
}
