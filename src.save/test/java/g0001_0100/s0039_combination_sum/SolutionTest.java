package g0001_0100.s0039_combination_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void combinationSum() {
        assertThat(
                new Solution().combinationSum(new int[] {2, 3, 6, 7}, 7),
                equalTo(ArrayUtils.getLists(new int[][] {{7}, {3, 2, 2}})));
    }

    @Test
    void combinationSum2() {
        assertThat(
                new Solution().combinationSum(new int[] {2, 3, 5}, 8),
                equalTo(ArrayUtils.getLists(new int[][] {{5, 3}, {3, 3, 2}, {2, 2, 2, 2}})));
    }

    @Test
    void combinationSum3() {
        assertThat(
                new Solution().combinationSum(new int[] {2}, 1),
                equalTo(ArrayUtils.getLists(new int[][] {})));
    }
}
