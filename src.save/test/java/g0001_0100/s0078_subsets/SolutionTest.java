package g0001_0100.s0078_subsets;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void subsets() {
        int[][] expected = {{}, {1}, {1, 2}, {1, 2, 3}, {1, 3}, {2}, {2, 3}, {3}};
        assertThat(
                new Solution().subsets(new int[] {1, 2, 3}),
                equalTo(ArrayUtils.getLists(expected)));
    }

    @Test
    void subsets2() {
        int[][] expected = {{}, {0}};
        assertThat(new Solution().subsets(new int[] {0}), equalTo(ArrayUtils.getLists(expected)));
    }
}
