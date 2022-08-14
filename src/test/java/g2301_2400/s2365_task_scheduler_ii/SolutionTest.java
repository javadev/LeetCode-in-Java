package g2301_2400.s2365_task_scheduler_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void taskSchedulerII() {
        assertThat(new Solution().taskSchedulerII(new int[] {1, 2, 1, 2, 3, 1}, 3), equalTo(9L));
    }

    @Test
    void taskSchedulerII2() {
        assertThat(new Solution().taskSchedulerII(new int[] {5, 8, 8, 5}, 2), equalTo(6L));
    }
}
