package g0001_0100.s0090_subsets_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void subsetsWithDup() {
        int[][] expected = {{1}, {1, 2}, {1, 2, 2}, {2}, {2, 2}, {}};
        assertThat(
                new Solution().subsetsWithDup(new int[] {1, 2, 2}),
                equalTo(ArrayUtils.getLists(expected)));
    }

    @Test
    void subsetsWithDup2() {
        int[][] expected = {{0}, {}};
        assertThat(
                new Solution().subsetsWithDup(new int[] {0}),
                equalTo(ArrayUtils.getLists(expected)));
    }
}
