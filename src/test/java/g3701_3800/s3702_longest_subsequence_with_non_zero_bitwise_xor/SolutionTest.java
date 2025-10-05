package g3701_3800.s3702_longest_subsequence_with_non_zero_bitwise_xor;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestSubsequence() {
        assertThat(new Solution().longestSubsequence(new int[] {1, 2, 3}), equalTo(2));
    }

    @Test
    void longestSubsequence2() {
        assertThat(new Solution().longestSubsequence(new int[] {2, 3, 4}), equalTo(3));
    }
}
