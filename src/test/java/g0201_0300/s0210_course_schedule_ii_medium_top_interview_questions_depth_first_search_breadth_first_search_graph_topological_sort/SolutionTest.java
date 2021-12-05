package g0201_0300.s0210_course_schedule_ii_medium_top_interview_questions_depth_first_search_breadth_first_search_graph_topological_sort;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void courseScheduleII() {
        int[][] prerequisites = {{1, 0}};
        int numCourses = 2;
        assertThat(new Solution().findOrder(numCourses, prerequisites), equalTo(new int[] {0, 1}));
    }
}
