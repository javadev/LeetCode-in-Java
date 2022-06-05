package g2101_2200.s2141_maximum_running_time_of_n_computers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxRunTime() {
        assertThat(new Solution().maxRunTime(2, new int[] {3, 3, 3}), equalTo(4L));
    }

    @Test
    void maxRunTime2() {
        assertThat(new Solution().maxRunTime(2, new int[] {1, 1, 1, 1}), equalTo(2L));
    }
}
