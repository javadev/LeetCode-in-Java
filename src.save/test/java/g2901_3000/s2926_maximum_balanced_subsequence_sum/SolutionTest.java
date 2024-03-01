package g2901_3000.s2926_maximum_balanced_subsequence_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxBalancedSubsequenceSum() {
        assertThat(new Solution().maxBalancedSubsequenceSum(new int[] {3, 3, 5, 6}), equalTo(14L));
    }

    @Test
    void maxBalancedSubsequenceSum2() {
        assertThat(
                new Solution().maxBalancedSubsequenceSum(new int[] {5, -1, -3, 8}), equalTo(13L));
    }

    @Test
    void maxBalancedSubsequenceSum3() {
        assertThat(
                new Solution().maxBalancedSubsequenceSum(new int[] {5, -1, -3, 8}), equalTo(13L));
    }
}
