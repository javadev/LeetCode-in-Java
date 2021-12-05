package g0001_0100.s0046_permutations_medium_top_100_liked_questions_top_interview_questions_array_backtracking;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void permute() {
        int[][] expected = {{1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 1, 2}, {3, 2, 1}};
        assertThat(
                new Solution().permute(new int[] {1, 2, 3}),
                equalTo(ArrayUtils.getLists(expected)));
    }
}
