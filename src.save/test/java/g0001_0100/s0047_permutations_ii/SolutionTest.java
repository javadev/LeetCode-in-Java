package g0001_0100.s0047_permutations_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void permuteUnique() {
        int[][] expected = {{1, 1, 2}, {1, 2, 1}, {2, 1, 1}};
        assertThat(
                new Solution().permuteUnique(new int[] {1, 1, 2}),
                equalTo(ArrayUtils.getLists(expected)));
    }

    @Test
    void permuteUnique2() {
        int[][] expected = {{1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 2, 1}, {3, 1, 2}};
        assertThat(
                new Solution().permuteUnique(new int[] {1, 2, 3}),
                equalTo(ArrayUtils.getLists(expected)));
    }
}
