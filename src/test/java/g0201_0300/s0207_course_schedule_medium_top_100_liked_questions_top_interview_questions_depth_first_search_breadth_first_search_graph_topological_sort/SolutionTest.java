package g0201_0300.s0207_course_schedule_medium_top_100_liked_questions_top_interview_questions_depth_first_search_breadth_first_search_graph_topological_sort;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void canFinish() {
        assertThat(new Solution().canFinish(2, new int[][] {{1, 0}}), equalTo(true));
    }

    @Test
    public void canFinish2() {
        assertThat(new Solution().canFinish(2, new int[][] {{1, 0}, {0, 1}}), equalTo(false));
    }
}
