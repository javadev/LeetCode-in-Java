package g0201_0300.s0216_combination_sum_iii_medium_array_backtracking;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void combinationSum3() {
        assertThat(
                new Solution().combinationSum3(3, 7),
                equalTo(ArrayUtils.getLists(new int[][] {{1, 2, 4}})));
    }
}
