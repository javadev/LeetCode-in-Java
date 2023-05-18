package g0601_0700.s0621_task_scheduler;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void leastInterval() {
        assertThat(
                new Solution().leastInterval(new char[] {'A', 'A', 'A', 'B', 'B', 'B'}, 2),
                equalTo(8));
    }

    @Test
    void leastInterval2() {
        assertThat(
                new Solution().leastInterval(new char[] {'A', 'A', 'A', 'B', 'B', 'B'}, 0),
                equalTo(6));
    }

    @Test
    void leastInterval3() {
        assertThat(
                new Solution()
                        .leastInterval(
                                new char[] {
                                    'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'
                                },
                                2),
                equalTo(16));
    }
}
