package g0601_0700.s0674_longest_continuous_increasing_subsequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findNumberOfLIS2() {
        assertThat(new Solution().findLengthOfLCIS(new int[] {1, 3, 5, 4, 7}), equalTo(3));
    }

    @Test
    void findNumberOfLIS22() {
        assertThat(new Solution().findLengthOfLCIS(new int[] {2, 2, 2, 2, 2}), equalTo(1));
    }
}
