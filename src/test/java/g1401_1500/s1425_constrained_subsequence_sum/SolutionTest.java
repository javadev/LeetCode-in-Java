package g1401_1500.s1425_constrained_subsequence_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void constrainedSubsetSum() {
        assertThat(
                new Solution().constrainedSubsetSum(new int[] {10, 2, -10, 5, 20}, 2), equalTo(37));
    }

    @Test
    void constrainedSubsetSum2() {
        assertThat(new Solution().constrainedSubsetSum(new int[] {-1, -2, -3}, 1), equalTo(-1));
    }

    @Test
    void constrainedSubsetSum3() {
        assertThat(
                new Solution().constrainedSubsetSum(new int[] {10, -2, -10, -5, 20}, 2),
                equalTo(23));
    }
}
