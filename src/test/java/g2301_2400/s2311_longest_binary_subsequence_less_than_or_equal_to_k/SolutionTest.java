package g2301_2400.s2311_longest_binary_subsequence_less_than_or_equal_to_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestSubsequence() {
        assertThat(new Solution().longestSubsequence("1001010", 5), equalTo(5));
    }

    @Test
    void longestSubsequence2() {
        assertThat(new Solution().longestSubsequence("00101001", 1), equalTo(6));
    }
}
