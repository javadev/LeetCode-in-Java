package g0001_0100.s0078_subsets_medium_top_100_liked_questions_top_interview_questions_array_bit_manipulation_backtracking;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void subsets() {
        int[][] expected = {{}, {1}, {1, 2}, {1, 2, 3}, {1, 3}, {2}, {2, 3}, {3}};
        assertThat(
                new Solution().subsets(new int[] {1, 2, 3}),
                equalTo(ArrayUtils.getLists(expected)));
    }
}
