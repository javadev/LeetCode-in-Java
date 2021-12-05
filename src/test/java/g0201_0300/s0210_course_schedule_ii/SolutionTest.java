package g0201_0300.s0210_course_schedule_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void courseScheduleII() {
        int[][] prerequisites = {{1, 0}};
        int numCourses = 2;
        assertThat(new Solution().findOrder(numCourses, prerequisites), equalTo(new int[] {0, 1}));
    }
}
