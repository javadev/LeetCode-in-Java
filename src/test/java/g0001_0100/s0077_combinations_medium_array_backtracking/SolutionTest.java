package g0001_0100.s0077_combinations_medium_array_backtracking;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void combine() {
        int[][] expected = {{1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4}, {3, 4}};
        assertThat(new Solution().combine(4, 2), equalTo(ArrayUtils.getLists(expected)));
    }
}
