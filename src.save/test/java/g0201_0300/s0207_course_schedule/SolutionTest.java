package g0201_0300.s0207_course_schedule;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canFinish() {
        assertThat(new Solution().canFinish(2, new int[][] {{1, 0}}), equalTo(true));
    }

    @Test
    void canFinish2() {
        assertThat(new Solution().canFinish(2, new int[][] {{1, 0}, {0, 1}}), equalTo(false));
    }
}
