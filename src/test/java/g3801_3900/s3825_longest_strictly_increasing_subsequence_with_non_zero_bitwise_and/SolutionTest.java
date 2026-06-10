package g3801_3900.s3825_longest_strictly_increasing_subsequence_with_non_zero_bitwise_and;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestSubsequence() {
        assertThat(new Solution().longestSubsequence(new int[] {5, 4, 7}), equalTo(2));
    }

    @Test
    void longestSubsequence2() {
        assertThat(new Solution().longestSubsequence(new int[] {2, 3, 6}), equalTo(3));
    }

    @Test
    void longestSubsequence3() {
        assertThat(new Solution().longestSubsequence(new int[] {0, 1}), equalTo(1));
    }
}
