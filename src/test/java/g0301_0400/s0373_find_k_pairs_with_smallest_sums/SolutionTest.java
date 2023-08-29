package g0301_0400.s0373_find_k_pairs_with_smallest_sums;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void kSmallestPairs() {
        assertThat(
                new Solution().kSmallestPairs(new int[] {1, 7, 11}, new int[] {2, 4, 6}, 3),
                equalTo(ArrayUtils.getLists(new int[][] {{1, 2}, {1, 4}, {1, 6}})));
    }

    @Test
    void kSmallestPairs2() {
        assertThat(
                new Solution().kSmallestPairs(new int[] {1, 1, 2}, new int[] {1, 2, 3}, 2),
                equalTo(ArrayUtils.getLists(new int[][] {{1, 1}, {1, 1}})));
    }

    @Test
    void kSmallestPairs3() {
        assertThat(
                new Solution().kSmallestPairs(new int[] {1, 2}, new int[] {3}, 3),
                equalTo(ArrayUtils.getLists(new int[][] {{1, 3}, {2, 3}})));
    }
}
