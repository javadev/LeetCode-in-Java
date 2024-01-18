package g0001_0100.s0046_permutations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void permute() {
        int[][] expected = {{1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 1, 2}, {3, 2, 1}};
        assertThat(
                new Solution().permute(new int[] {1, 2, 3}),
                equalTo(ArrayUtils.getLists(expected)));
    }

    @Test
    void permute2() {
        int[][] expected = {{0, 1}, {1, 0}};
        assertThat(
                new Solution().permute(new int[] {0, 1}), equalTo(ArrayUtils.getLists(expected)));
    }

    @Test
    void permute3() {
        int[][] expected = {{1}};
        assertThat(new Solution().permute(new int[] {1}), equalTo(ArrayUtils.getLists(expected)));
    }
}
