package g0001_0100.s0056_merge_intervals_medium_top_100_liked_questions_top_interview_questions_array_sorting;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void merge() {
        int[][] input = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] expected = {{1, 6}, {8, 10}, {15, 18}};
        assertThat(new Solution().merge(input), equalTo(expected));
    }
}
