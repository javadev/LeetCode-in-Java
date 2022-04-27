package g0201_0300.s0300_longest_increasing_subsequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void lengthOfLIS() {
        assertThat(new Solution().lengthOfLIS(new int[] {10, 9, 2, 5, 3, 7, 101, 18}), equalTo(4));
    }

    @Test
    void lengthOfLIS2() {
        assertThat(new Solution().lengthOfLIS(new int[] {0, 1, 0, 3, 2, 3}), equalTo(4));
    }

    @Test
    void lengthOfLIS3() {
        assertThat(new Solution().lengthOfLIS(new int[] {7, 7, 7, 7, 7, 7, 7}), equalTo(1));
    }
}
