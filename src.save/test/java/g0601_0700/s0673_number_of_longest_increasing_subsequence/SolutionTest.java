package g0601_0700.s0673_number_of_longest_increasing_subsequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findNumberOfLIS() {
        assertThat(new Solution().findNumberOfLIS(new int[] {1, 3, 5, 4, 7}), equalTo(2));
    }

    @Test
    void findNumberOfLIS2() {
        assertThat(new Solution().findNumberOfLIS(new int[] {2, 2, 2, 2, 2}), equalTo(5));
    }
}
