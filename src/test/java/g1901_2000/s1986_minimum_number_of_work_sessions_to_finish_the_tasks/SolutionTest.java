package g1901_2000.s1986_minimum_number_of_work_sessions_to_finish_the_tasks;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minSessions() {
        assertThat(new Solution().minSessions(new int[] {1, 2, 3}, 3), equalTo(2));
    }

    @Test
    void minSessions2() {
        assertThat(new Solution().minSessions(new int[] {3, 1, 3, 1, 1}, 8), equalTo(2));
    }

    @Test
    void minSessions3() {
        assertThat(new Solution().minSessions(new int[] {1, 2, 3, 4, 5}, 15), equalTo(1));
    }
}
