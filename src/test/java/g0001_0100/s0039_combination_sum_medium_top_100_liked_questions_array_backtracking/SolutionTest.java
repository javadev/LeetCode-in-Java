package g0001_0100.s0039_combination_sum_medium_top_100_liked_questions_array_backtracking;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void combinationSum() {
        assertThat(
                new Solution().combinationSum(new int[] {2, 3, 6, 7}, 7),
                equalTo(ArrayUtils.getLists(new int[][] {{7}, {3, 2, 2}})));
    }
}
